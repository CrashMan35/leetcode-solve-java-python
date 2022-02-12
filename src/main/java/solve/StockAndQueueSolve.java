package solve;

import java.util.*;

public class StockAndQueueSolve {
    public static boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            if (Arrays.asList('(', '[', '{').contains(s.charAt(i))) {
                left.push(s.charAt(i));
            } else {
                if (left.isEmpty()||map.get(left.pop())!=s.charAt(i)) {
                    return false;
                }
            }
        }
        return left.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}

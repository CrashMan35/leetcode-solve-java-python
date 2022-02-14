package solve;

public class BinarySearchSolve {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int low = 0, high = x;
        while (low < high) {
            int middle = low + (high - low) / 2;
            int sqrt = x / middle;
            if (middle > sqrt) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low - 1;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        while (left<right) {
            int middle = left + (right - left)/2;
            if (letters[middle]> target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return letters[left % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters,'j'));
    }
}

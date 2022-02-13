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

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }
}

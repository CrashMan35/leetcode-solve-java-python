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


    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;
        while (low < high) {
            int middle = low + (high - low) / 2;
            if ((middle % 2 == 1 && nums[middle] == nums[middle - 1]) || (middle % 2 == 0 && nums[middle] == nums[middle + 1])) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }
        return nums[low];
    }

    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low < high) {
            int middle = low + (high - low)/2;
            if (isBadVersion(middle)) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int middle) {
        return false;
    }

    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters,'j'));
    }
}

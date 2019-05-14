package year_2019.month_may.day_13;

/**
 * 有数组越界的问题
 */
public class ArrayRepeat2 {
    public static boolean duplicate(int[] nums, int length, int[] duplication) {
        /**
         *
         * s0:0,2,4,1,2,5
         * s1:0,4,2,1,2,5
         * s3:0,2,2,1,4,5
         *
         */
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int [] arr = {0,2,3,2,4,4,4};
        boolean duplicate = duplicate(arr, 6, arr);
        System.out.println(duplicate);
    }
}

package com.epam.algorithm.medium;

public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        nums = sort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }

    // better result
    public static int sortBetter(int[] nums) {
        int slow = 0;
        int fast = 0;
        int finder = 0;

        while (true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast)
                break;
        }
        while (true)
        {
            slow = nums[slow];
            finder = nums[finder];
            if (slow == finder)
                return slow;

        }
    }

    public static int[] sort(int[] nums, int start, int end) {
        if (start < end) {
            int middle = start + (((end + 1) - start) / 2); // this is the first index of the second array
            sort(nums, start, middle-1);
            sort(nums, middle, end);
            merge(nums, start, middle, end);
        }
        return nums;
    }

    public static void merge(int[] nums, int firstStart, int middle, int secondEnd) {
        while (firstStart < middle && middle <= secondEnd) {
            if (nums[firstStart] < nums[middle]) {
                firstStart++;
            }
            else {
                int temp = nums[middle];
                int i = middle;
                while(i > firstStart) {
                    nums[i] = nums[i-1];
                    i--;
                }
                nums[firstStart] = temp;
                firstStart++;
                middle++;
            }
        }
    }
}

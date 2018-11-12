package com.epam.algorithm.sorting;

public class QuickSort {

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

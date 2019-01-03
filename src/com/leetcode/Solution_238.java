package com.leetcode;
/*
* 238. 除自身以外数组的乘积
*
*
给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。

示例:

输入: [1,2,3,4]
输出: [24,12,8,6]

说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
* */
public class Solution_238 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] l = new int[length];
        int[] r = new int[length];
        int left = 1;
        int right = 1;

        for(int i = 0; i < length; i++) {
            l[i] = left;
            left *= nums[i];
        }

        for(int j = length -1; j >=0; j--) {
            r[j] = right;
            right *= nums[j];
        }

        for(int i = 0; i < length; i++) {
            nums[i] = l[i] * r[i];
        }
        return nums;
    }
}

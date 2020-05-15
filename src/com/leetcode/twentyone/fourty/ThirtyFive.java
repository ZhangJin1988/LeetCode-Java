package com.leetcode.twentyone.fourty;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * @author zhangjin
 * @date 2020-05-15 10:17
 */
public class ThirtyFive {

    public int searchInsert(int[] nums, int target) {
        int result = 0;

        if (nums.length == 0) {
            return result;
        }


        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i] ) {
                result = i;
                break;
            } else {
                if(i==nums.length -1){
                    result = i+1;
                    break;
                }
            }

        }

        return result;

    }


    public static void main(String[] args) {
        int i = new ThirtyFive().searchInsert(new int[]{1, 3, 5, 7}, 2);
        System.out.println(i);
    }
}

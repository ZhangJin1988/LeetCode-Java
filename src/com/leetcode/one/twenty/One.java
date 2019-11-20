package com.leetcode.one.twenty;

import java.util.HashMap;

/**
 * @author zhangjin
 * @date 2019-11-20 10:58
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class One {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }


    public int[] twoSum2(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {

            if (map.get(target - nums[j]) != null && map.get(target - nums[j]) != 0 && map.get(target - nums[j]) != j) {
                return new int[]{j, map.get(target - nums[j])};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        One one = new One();
        int[] test = new int[]{1, 3, 4, 2};
        int[] ints = one.twoSum2(test, 6);
        for (int value : ints) {
            System.out.println(value);
        }


    }


}

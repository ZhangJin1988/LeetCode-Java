package com.leetcode.one.twenty;

import java.math.BigDecimal;

/**
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author zhangjin
 * @date 2020-05-07 10:04
 */
public class Nine {

        public boolean isPalindrome(int x) {


            StringBuilder sb = new StringBuilder();
            if(x<0){
                return false;
            }else if(x>0){
                char[] chars = Integer.valueOf(x).toString().toCharArray();
                for(int i = chars.length -1 ;i >=0;i--){
                    sb.append(chars[i]);
                }

                BigDecimal result = new BigDecimal(sb.toString());
                if(result.doubleValue()>Integer.MAX_VALUE || result.doubleValue()<Integer.MIN_VALUE){
                    return false;
                }


                if(Integer.valueOf(sb.toString()).equals(Integer.valueOf(x))){
                    return true;
                }else {
                    return false;
                }

            }


            return true;


        }


    public static void main(String[] args) {
        boolean palindrome = new Nine().isPalindrome(1232323232);
        System.out.println(palindrome);
    }
}

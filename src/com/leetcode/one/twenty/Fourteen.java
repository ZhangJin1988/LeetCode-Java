package com.leetcode.one.twenty;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 通过次数241,732提交次数651,008
 *
 * @author zhangjin
 * @date 2020-05-09 10:17
 */
public class Fourteen {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length != 0 && strs.length == 1) {
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();
        char[] firtChars = strs[0].toCharArray();
        for (int j = 0; j < firtChars.length; j++) {
            for (int i = 1; i < strs.length; i++) {
                char[] tempChars = strs[i].toCharArray();
                if (j < tempChars.length && firtChars[j] == tempChars[j]) {
                    continue;
                } else {
                    return sb.toString();
                }

            }
            sb.append(firtChars[j]);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"abc", "ab", "abcde"};
        String s = new Fourteen().longestCommonPrefix(strs);
        System.out.println(s);

    }
}

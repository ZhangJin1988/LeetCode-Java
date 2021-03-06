package com.leetcode.twentyone.fourty;

/**
 * 28. 实现 strStr()
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * <p>
 * 通过次数169,618提交次数427,476
 *
 * @author zhangjin
 * @date 2020-05-19 10:30
 */
public class TwentyEight {


    public int strStr(String haystack, String needle) {


        if (needle.equals("") || needle.length() == 0) {
            return 0;
        }


        if (needle != null && haystack.length() >= needle.length()) {
            char[] haystackChars = haystack.toCharArray();
            char[] needleChars = needle.toCharArray();


            for (int i = 0; i + needleChars.length - 1 < haystackChars.length; i++) {
                StringBuilder sb = new StringBuilder();
                if (haystackChars[i] == needleChars[0]) {
                    for (int j = 0; j < needleChars.length; j++) {
                        sb.append(haystackChars[i + j]);
                    }
                    if (sb.toString().equals(needle)) {
                        return i;
                    }
                }
            }




        }
        return -1;

    }



    public static void main(String[] args) {


        int i = new TwentyEight().strStr("", "");
        System.out.println(i);
    }

}

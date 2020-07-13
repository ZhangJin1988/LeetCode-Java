package com.leetcode.twentyone.fourty;

/**
 * 38. 外观数列
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * <p>
 * 注意：整数序列中的每一项将表示为一个字符串。
 * <p>
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * <p>
 * 描述前一项，这个数是 1 即 “一个 1 ”，记作 11
 * <p>
 * 描述前一项，这个数是 11 即 “两个 1 ” ，记作 21
 * <p>
 * 描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211
 * <p>
 * 描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 解释：这是一个基本样例。
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 * 解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。
 * 通过次数109,473提交次数196,380
 *
 * @author zhangjin
 * @date 2020-07-13 10:15
 */
public class ThirtyEight {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        return say(countAndSay(n - 1));
    }

    private String say(String s) {
        //记录数值出现的次数
        int count = 1;
        //当前的数值
        char num = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == num) {
                count++;
            } else {
                sb.append(count);
                sb.append(num);
                num = c;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(num);
        return sb.toString();
    }


    public static void main(String[] args) {

        String s = new ThirtyEight().countAndSay(5);

        System.out.println(s);

    }
}

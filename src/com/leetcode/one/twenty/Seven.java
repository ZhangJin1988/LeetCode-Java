package com.leetcode.one.twenty;

import java.math.BigDecimal;

/**
 * @author zhangjin
 * @date 2020-05-06 10:34
 */
public class Seven {


    public int reverse(int x) {

        if (x == 0) {
            return x;
        }

        String s = String.valueOf(x);

        char[] chars = s.toCharArray();

        char minus = '-';

        //负数的情况
        StringBuilder sb = new StringBuilder();
        if (chars[0] == minus) {
            sb.append("-");
            for (int i = chars.length - 1; i > 0; i--) {
                sb.append(chars[i]);
            }
        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }
        }

        BigDecimal result = new BigDecimal(sb.toString());
        if(result.doubleValue()>Integer.MAX_VALUE || result.doubleValue()<Integer.MIN_VALUE){
            return 0;
        }


        return result.intValue();

    }

    public static void main(String[] args) {


        Seven seven = new Seven();

//        int reverse = seven.reverse(1534236469);
        int reverse = seven.reverse(-2147483648);
        System.out.println(reverse);
    }


}

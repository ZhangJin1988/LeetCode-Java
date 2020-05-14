package com.leetcode.one.twenty;

import java.util.ArrayList;
import java.util.List;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * 通过次数274,692提交次数661,109
 *
 * @author zhangjin
 * @date 2020-05-14 10:54
 */
public class Twenty {


    public boolean isValid(String s) {

        if (s == null || s == "") {
            return false;
        }

        char[] chars = s.toCharArray();
        List<Character> stack = new ArrayList();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(') {
                stack.add(chars[i]);
            }
            if (chars[i] == '}' || chars[i] == ']' || chars[i] == ')') {
                if (stack.size() > 0) {
                    Character remove = stack.remove(stack.size() - 1);
                    if (chars[i] == '}' && remove == '{') {
                        continue;
                    }
                    if (chars[i] == ')' && remove == '(') {
                        continue;
                    }
                    if (chars[i] == ']' && remove == '[') {
                        continue;
                    }
                    return false;

                } else {
                    return false;
                }
//                return false;
            }
        }

        if(stack.size() == 0){
            return true;

        }

        return false;
    }

    public static void main(String[] args) {


        boolean valid = new Twenty().isValid("(]");
        System.out.println(valid);
    }
}


package com.shujujiegou;

import java.util.*;

/**
 * @author 单耀
 * @version 1.0
 * @description
 * @date 2021/4/2 10:46
 */
public class Niuke {
    public static boolean isValid (String s) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.size() > 0 && stack.pop() == '(') continue;
                else return false;
            }
            if (c == '}') {
                if (stack.size() > 0 && stack.pop() == '{') continue;
                else return false;
            }
            if (stack.size() > 0 && c == ']') {
                if (stack.pop() == '[') continue;
                else return false;
            }
            stack.push(c);
        }
        if (stack.size() > 0) return false;
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isValid("(()"));
    }


}

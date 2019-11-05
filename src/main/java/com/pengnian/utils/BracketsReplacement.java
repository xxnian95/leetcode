package com.pengnian.utils;

/**
 * 将String中的方括号全部替换为花括号
 *
 * @author Zhang Pengnian
 * @since 2019-11-05 14:59
 */
public class BracketsReplacement {

    public static String replace(String original) {

        return original.replace('[', '}')
                .replace(']', '}');
    }

}

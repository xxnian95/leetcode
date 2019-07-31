package com.pengnian.offer.q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @since 2019-07-31 21:14
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        int loopCount = 0;
        while (loopCount < 100) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            char[] str = bf.readLine().toCharArray();
            Solution solution = new Solution();
            System.out.println(solution.isNumeric(str));
            loopCount++;
        }
    }

    private boolean isNumeric(char[] str) {
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == '.') {
                //判断小数点的个数是否符合要求
                for (int j = i + 1; j < str.length; j++) {
                    if (str[j] == '.') {
                        return false;
                    }
                }
                //小数点在两端或者小数点前后的字符不是数字
                //小数点前面可以没有数字，例如.1
//                if (i == 0 || i == str.length - 1
//                        || !isNumber(str[i + 1]) || !isNumber(str[i - 1])) {
//                    return false;
//                }
                //不能在最右侧或者右侧是E
                if (i == str.length - 1 || isE(str[i + 1])) {
                    return false;
                }

            } else if (isE(c)) {
                //E的个数不能超过1个，并且E的后方不能出现小数点
                for (int j = i + 1; j < str.length; j++) {
                    if (isE(str[j]) || str[j] == '.') {
                        return false;
                    }
                }
                //E不能位于左右
                if (i == 0 || i == str.length - 1) {
                    return false;
                }
                //E的前面必须是数字
                if (!isNumber(str[i - 1])) {
                    return false;
                }
            } else if (isOperator(c)) {
                //符号的个数不能超过2个
                int countOfOperator = 0;
                LinkedList<Integer> indexOfOperator = new LinkedList<>(),
                        indexOfE = new LinkedList<>();
                for (int j = 0; j < str.length; j++) {
                    //统计符号和E的个数
                    if (isE(str[j])) {
                        indexOfE.add(j);
                    } else if (isOperator(str[j])) {
                        indexOfOperator.add(j);
                    }
                }
                //只能出现最多一个E和最多两个运算符
                if (indexOfE.size() > 1 || indexOfOperator.size() > 2) {
                    return false;
                }
                if (indexOfOperator.size() == 1) {
                    //如果只有1个符号，那么必须在最左端，或者在E的右侧
                    if (!(indexOfOperator.getFirst() == 0
                            || isE(str[indexOfOperator.getFirst() - 1]))) {
                        return false;
                    }
                } else if (indexOfOperator.size() == 2) {
                    int operator1 = indexOfOperator.get(0),
                            operator2 = indexOfOperator.get(1);
                    //如果有两个小数点，必须有1个E
                    if (indexOfE.size() == 0) {
                        return false;
                    }
                    int e = indexOfE.get(0);
                    //E不能位于左右
                    if (e == 0 || e == str.length - 1) {
                        return false;
                    }
                    //E的左边必须是数字
                    if (!isNumber(str[e - 1])) {
                        return false;
                    }
                    //第一个符号必须在左边，第二个符号必须在E的右侧
                    if (!(operator1 == 0 && operator2 == e + 1)) {
                        return false;
                    }
                    //并且第二个符号不能位于最右侧
                    else if (operator2 == (str.length - 1)) {
                        return false;
                    }
                }
            } else if (!isNumber(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isE(char c) {
        return c == 'E' || c == 'e';
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-';
    }
}

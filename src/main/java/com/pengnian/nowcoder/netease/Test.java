package com.pengnian.nowcoder.netease;

import java.text.DecimalFormat;

/**
 * @author Zhang Pengnian
 * @since 2019-08-03 15:35
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test() {
        double a = 12.3456789d;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(a));
    }
}

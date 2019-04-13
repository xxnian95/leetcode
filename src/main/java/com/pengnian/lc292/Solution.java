package com.pengnian.lc292;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-13 14:33
 */
class Solution {

    @Test
    void test() {
        int a = 200;
        System.out.println(canWinNim(a));
    }

    private boolean canWinNim(int n) {
//        return canWinNim(n, true);
        return n% 4!=0;
    }

    private boolean canWinNim(int n, boolean isMe) {
        if(n<=3){
            return isMe;
        }
        return canWinNim(n-1, !isMe) || canWinNim(n-2, !isMe) || canWinNim(n-3, !isMe);
    }
}

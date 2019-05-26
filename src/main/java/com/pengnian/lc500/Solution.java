package com.pengnian.lc500;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @since 2019-05-26 18:25
 */
class Solution {

    @Test
    void test() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        for (String string : findWords(words))
            System.out.println(string);
    }

    private String[] findWords(String[] words) {
        StringBuilder stringBuilder1 = new StringBuilder("QWERTYUIOPqwertyuiop"),
                stringBuilder2 = new StringBuilder("ASDFGHJKLasdfghjkl"),
                stringBuilder3 = new StringBuilder("ZXCVBNMzxcvbnm");
        LinkedList<String> list = new LinkedList<>();
        for (String string : words) {
            int position = -1;
            int wrongFlag = 0;
            loop:
            for (Character character : string.toCharArray()) {
                if (position == -1) {
                    if (stringBuilder1.indexOf(character.toString()) != -1)
                        position = 1;
                    else if (stringBuilder2.indexOf(character.toString()) != -1)
                        position = 2;
                    else
                        position = 3;
                } else {
                    switch(position) {
                        case 1:
                            if(stringBuilder1.indexOf(character.toString()) == -1){
                                wrongFlag = 1;
                                break loop;
                            }
                            break;
                        case 2:
                            if(stringBuilder2.indexOf(character.toString()) == -1){
                                wrongFlag = 1;
                                break loop;
                            }
                            break;
                        case 3:
                            if(stringBuilder3.indexOf(character.toString()) == -1){
                                wrongFlag = 1;
                                break loop;
                            }
                            break;
                    }
                }
            }
            if(wrongFlag == 0) {
                list.add(string);
            }
        }

        String[] result = new String[list.size()];
        int index = 0;
        for(String string : list) {
            result[index] = string;
            index++;
        }
        return result;
    }
}

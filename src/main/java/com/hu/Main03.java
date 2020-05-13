package com.hu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/13 17:14
 * @description
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * 接口说明
 *  反转句子  public String reverse(String sentence);
 * */

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        for (int i = strings.length -1; i >=0 ; i--) {
            if (i !=0){
                System.out.print(strings[i]+" ");
            }
            else {
                System.out.print(strings[i]);
            }
        }
    }
}

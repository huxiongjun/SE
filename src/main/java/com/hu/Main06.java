package com.hu;

import java.util.Scanner;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/14 10:02
 * @description 删除公共字符串 ,第一个字符串中删除第二个字符串
 */
public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        Scanner scanner02 = new Scanner(System.in);
        String s2 = scanner02.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(s1.charAt(i)+"")){
                continue;
            }
            stringBuilder.append(s1.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}

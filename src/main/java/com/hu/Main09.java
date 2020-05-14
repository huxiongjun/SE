package com.hu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/14 10:33
 * @description
 */
public class Main09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){ // 考虑循环输入
            String s = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    stringBuilder.append(" ");
                    continue;
                }
                stringBuilder.append(s.charAt(i));
            }
            String[] strings = stringBuilder.toString().split(" ");
            List<String> list = new ArrayList<>();
            for (String string : strings) {
                if (!string.equals("")) {
                    list.add(string);
                }
            }
            for (String s1 : list) {


            }

        }
    }
}

package com.hu;

import java.util.Scanner;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/13 17:12
 * @description 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
}

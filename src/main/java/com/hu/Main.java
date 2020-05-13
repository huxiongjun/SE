package com.hu;

import java.util.Scanner;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/13 17:08
 * @description 机器测试题目
 */
/*
描述：
        输入一个整数，将这个整数以字符串的形式逆序输出
        程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String numStr = num + "";
        StringBuilder stringBuilder = new StringBuilder(numStr);
        System.out.println(stringBuilder.reverse());
    }
}

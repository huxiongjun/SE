package com.hu;

import java.util.*;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/13 17:21
 * @description 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 */
public class Main04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Scanner scanner02 = new Scanner(System.in);
        while (count-->0){
            String s = scanner02.nextLine();
            list.add(s);
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

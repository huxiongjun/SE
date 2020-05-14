package com.hu;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/14 10:13
 * @description TODO
 */
public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        char[] chars = s1.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (char c : chars) {
            if (!linkedHashMap.containsKey(c)) {
                linkedHashMap.put(c,1);
            }
        }
        Set<Character> keySet = linkedHashMap.keySet();
        for (Character character : keySet) {
            System.out.print(character);
        }
    }
}

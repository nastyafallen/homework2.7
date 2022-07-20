package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("яблоко", "дыня", "персик", "яблоко", "кепка", "кошка"));
        printNumbers(nums);
        System.out.println();
        printNumbers2(nums);
        System.out.println();
        printWords(words);
        System.out.println();
        printIterations();
    }

    public static void printNumbers(List<Integer> a) {
        for (Integer integer : a) {
            if (integer % 2 != 0) {
                System.out.print(integer + ", ");
            }
        }
    }

    public static void printNumbers2(List<Integer> a) {
        Set<Integer> setList = new TreeSet<>(a);
        for (Integer integer : setList) {
            if (integer % 2 == 0) {
                System.out.print(integer + ", ");
            }
        }
    }

    public static void printWords(List<String> a) {
        Set<String> setListWords = new HashSet<>(a);
        System.out.println(setListWords);
    }

    public static void printIterations() {
        List<String> strings = new ArrayList<>(List.of("яблоко", "дыня", "персик", "яблоко", "кепка", "кошка", "мяч", "кошка", "кошка"));
        Map<String, Integer> wordsIterations = new HashMap<>();
        System.out.println("Повторения:");
        for (String s : strings) {
            if (wordsIterations.containsKey(s)) {
                wordsIterations.put(s, wordsIterations.get(s) + 1);
            } else {
                wordsIterations.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsIterations.entrySet()) {
            System.out.println("Слово " + entry.getKey() + " - " + entry.getValue() + ";");
        }
    }
}

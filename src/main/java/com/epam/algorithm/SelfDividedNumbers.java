package com.epam.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SelfDividedNumbers {

    public static void main(String... args) {
        int left = 1;
        int right = 22;
        List<Integer> validNumbers = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (ifSelfDividing(i)) {
                validNumbers.add(i);
            }
        }
        Stack number = new Stack();
        number.push(12);
        System.out.println("");
    }

    public static boolean ifSelfDividing(int number) {
        if (number / 10 == 0) {
            return true;
        }
        String s = String.valueOf(number);
        if (s.contains("0")) {
            return false;
        }
        char[] numbers = s.toCharArray();
        for (char num : numbers) {
            int a = Character.getNumericValue(num);
            System.out.println("Num is : " + a);
            if (number % a != 0) {
                return false;
            }
        }
        return true;
    }
}

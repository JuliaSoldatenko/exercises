package com.epam.algorithm.easy;

public class HamiltonDifference {


    public static void main(String... agrs) {
//        decToBinary(25);
        System.out.println("one : " + Integer.toBinaryString(25));
        System.out.println("two : " + Integer.toBinaryString(20));
        System.out.println("result : " + Integer.toBinaryString(25 ^ 20));

    }

    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.println(binaryNum[j]);
    }
}

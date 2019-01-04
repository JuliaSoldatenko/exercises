package com.epam.algorithm.matrix;

public class ReverseMatrix {

    public static void main(String... args) {
        int[][] matrix = {
                {1,1,0,0},
                {0,0,1,0},
                {0,1,0,1}

        };
        System.out.println(reverseMatrix(matrix));
        System.out.println("bla");
    }

    public static int[][] flipAndRevert(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0, k = length - 1; j < k; j++, k--) {
                int temp = A[i][j];
                int reversedFirst = temp == 1 ? 0 : 1;
                int reversedSecond = A[i][k] == 1 ? 0 : 1;
                A[i][j] = reversedSecond;
                A[i][k] = reversedFirst;
                if (length % 2 != 0) {
                    A[i][length/2] = A[i][length/2] == 1 ? 0 : 1;
                }
            }
        }
        return A;
    }


    public static int[][] reverseMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0, k = length - 1; j < k; j++, k--) {
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
        }
        return A;
    }

}

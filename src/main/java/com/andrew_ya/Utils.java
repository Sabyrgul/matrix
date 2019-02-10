package com.andrew_ya;

public class Utils {

    public static void printMatrix(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {

                if (j == a.length - 1) {
                    System.out.println(a[i][j]);
                } else {
                    System.out.print(a[i][j] + " ");
                }

            }
        }
    }


}

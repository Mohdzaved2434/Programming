package com.pro.gen;

public class CountCountries {

    public static void main(String[] args) {

        int[][] A =
                {
                        {5, 4, 4},
                        {4, 3, 4},
                        {3, 2, 4},
                        {2, 2, 2},
                        {3, 3, 4},
                        {1, 4, 4},
                        {4, 1, 1},
                };
        System.out.println(countriesCount(A));
    }

    public static int countriesCount(int[][] A) {
        int countriesCount = 0;
        int length = A.length;
        int width = A[0].length; // N*M
        if (length == 0 || width == 0) return 0;

        int[][] b = new int[length][width];

        for (int i = 0; i < length; i++)
            for (int j = 0; j < width; j++) {
                if (b[i][j] >= 0) {
                    checkColor(A, b, i, j, length, width);
                    countriesCount++;
                }
            }
        return countriesCount;
    }

    public static void checkColor(int[][] A, int[][] B, int i, int j, int length, int width) {
        if (B[i][j] == -1) return;
        B[i][j] = -1;
        if (i + 1 < length)
            if (A[i + 1][j] == A[i][j]) checkColor(A, B, i + 1, j, length, width);
        if (i - 1 >= 0)
            if (A[i - 1][j] == A[i][j]) checkColor(A, B, i - 1, j, length, width);
        if (j + 1 < width)
            if (A[i][j + 1] == A[i][j]) checkColor(A, B, i, j + 1, length, width);
        if (j - 1 >= 0)
            if (A[i][j - 1] == A[i][j]) checkColor(A, B, i, j - 1, length, width);
    }
}

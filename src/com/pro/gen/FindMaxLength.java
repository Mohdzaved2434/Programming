package com.pro.gen;

public class FindMaxLength {

    public static void main(String[] args) {

        int[] A = {1, 2, 4, 2, 5};
        System.out.println(findMaxLenght(A));
        int[] B = {1, 3, 4, 2, 6};
        System.out.println(findMaxLenght(B));

    }

    public static int findMaxLenght(int[] A) {

        if (A.length == 1) return 1;
        int even = A[0], odd = A[1];
        int start = 0, max_len = 0;

        for (int i = 2; i < A.length; i++) {
            if (i % 2 == 0 && A[i] != even || i % 2 == 1 && A[i] != odd) {
                max_len = Math.max(max_len, i - start);
                start = i - 1;
                if (i % 2 == 0) {
                    even = A[i];
                    odd = A[i - 1];
                } else {
                    even = A[i - 1];
                    odd = A[i];
                }
            }
        }
        return Math.max(max_len, A.length - start);
    }
}

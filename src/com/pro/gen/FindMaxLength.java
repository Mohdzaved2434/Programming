package com.pro.gen;

public class FindMaxLength {

    public static void main(String[] args) {

        int[] A = {1, 2, 4, 2, 5};
        System.out.println(findMaxLenght(A));
        int[] B = {1, 3, 4, 2, 6};
        System.out.println(findMaxLenght(B));

        System.out.println(findMax(A));
        System.out.println(findMax(B));

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
                    odd = A[i - 1];
                    even = A[i];
                } else {
                    even = A[i - 1];
                    odd = A[i];
                }
            }
        }
        return Math.max(max_len, A.length - start);
    }


    public static int findMax(int[] input) {
        if (input.length <= 2) {
            return input.length;
        }
        int even = input[0];
        int odd = input[1];

        int start = 0;
        int end = 0;

        for (int i = 2; i < input.length; i++) {
            if (i % 2 == 0 && even != input[i] || i % 2 == 1 && odd != input[i]) {
                end = Math.max(end, i - start);
                start = i - 1;
                if (i % 2 == 0) {
                    odd = input[i - 1];
                    even = input[i];
                } else {
                    even = input[i - 1];
                    odd = input[i];
                }
            }
        }
        return Math.max(end, input.length - start);
    }
}

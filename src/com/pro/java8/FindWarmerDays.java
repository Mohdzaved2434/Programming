package com.pro.java8;

import java.util.Stack;

public class FindWarmerDays {

    public static void usingLoop() {
        int temp[] = {46, 42, 78, 65, 89, 64, 32, 45, 78, 90};
        int result[] = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++)
                if (temp[i] < temp[j]) {
                    result[i] = j - i;
                    break;
                } else {
                    continue;
                }
        }
        for (int i : result) {
            System.out.print(i);
        }
        // Time Complexity: O(N2)
        // Auxiliary Space: O(1)
    }

    public static void usingStack() {
        int temp[] = {46, 42, 78, 65, 89, 64, 32, 45, 78, 90};
        int result[] = new int[temp.length];

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < temp.length; i++) {
            while (!s.isEmpty() && temp[s.peek()] < temp[i]) {
                result[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }
        System.out.println("////////////////");
        for (int i : result) {
            System.out.print(i);
        }

        // Time Complexity: O(N)
        // Auxiliary Space: O(N)

    }

    public static void main(String[] args) {
       // usingLoop();
        usingStack();
    }
}

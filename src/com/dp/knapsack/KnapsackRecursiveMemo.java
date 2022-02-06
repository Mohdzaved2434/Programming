package com.dp.knapsack;

public class KnapsackRecursiveMemo {

    static int test[][] = new int[4 + 1][50 + 1];

    static int max(int a, int b) {

        return (a > b) ? a : b;

    }

    static int knapSack(int w, int wt[], int val[], int n) {

        if (n == 0 || w == 0)
            return 0;

        if (wt[n - 1] > w)
            return test[n][w] = knapSack(w, wt, val, n - 1);

        else {
            //This function will return max number of value for min weight
            return test[n][w] = max(val[n - 1] + knapSack(w - wt[n - 1], wt, val, n - 1), knapSack(w, wt, val, n - 1));
        }
    }

    // Driver code
    public static void main(String args[]) {
        int val[] = new int[]{200, 100, 120, 30};
        int wt[] = new int[]{30, 10, 15, 5};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}


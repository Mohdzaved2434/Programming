package com.pro.gen;

public class FindFirstDuplicate {

    public static int findFirstDuplicate(int nums[], int duplicateNum) {

        int index = 0;
        boolean isFirstTime = true;

        for (int i = 0; i < nums.length; i++) {
            if (duplicateNum == nums[i]) {
                if (isFirstTime) {
                    index = i;
                    isFirstTime = false;
                } else {
                    break;
                }
            }
        }
        return isFirstTime ? -1 : index;
    }

    public static void main(String[] args) {
        int nums[] = {4, 6, 8, 7, 9, 7};
        System.out.println(findFirstDuplicate(nums, 5));
    }
}




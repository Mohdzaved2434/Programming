package com.pro.java8;

import java.util.ArrayList;

public class FilterClass implements A, B{

        public void A() {
            System.out.println("hello");
            A.super.A();
            B.super.A();
        }

    public static String encrptmessage(int input) {


        ArrayList al =  new ArrayList();
        al.add(10);
        al.forEach((n)->System.out.println(n));



        int fourth = input % 10;
        input = input / 10;
        int third = input % 10;
        input = input / 10;
        int second = input % 10;
        int first = input / 10;


        float ff = ((float) first / (float) second);
        StringBuilder enrptString = new StringBuilder();
        enrptString.append(first * second).append('|')
                .append(ff).append('|')
                .append(fourth + third).append('|')
                .append(fourth - third);

        return enrptString.toString();


    }

    public static void main(String[] args) {
        new FilterClass().A();
        System.out.println(encrptmessage(1234));
    }
}

interface A{

    default void A(){
        System.out.println("A");
    };
}
interface B{
    default void A(){
        System.out.println("B");
    };
}

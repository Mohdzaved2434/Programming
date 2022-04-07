package com.pro.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberWithJava8 {


    public static void random6() {
        Random random = new Random();
        random.ints().limit(6).map(n -> Math.abs(n)).forEach(n -> System.out.println(n));
    }

    public static void statsArray() {
        int[] numbs = {1, 3, 6, 4, 89, 93};

        IntSummaryStatistics intSummaryStatistics = Arrays.stream(numbs).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
    }

    public static void statsObj() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(10));
        products.add(new Product(3));
        products.add(new Product(15));
        products.add(new Product(5));
        products.add(new Product(12));

        IntSummaryStatistics collect = products.stream().collect(Collectors.summarizingInt(Product::getPrice));
        System.out.println(collect.getMax());
        System.out.println(collect.getAverage());
        System.out.println(collect.getMin());
        System.out.println(collect.getCount());
        System.out.println(collect.getSum());

    }


    public static void main(String[] args) {
        // random6();
        // statsArray();
        statsObj();

    }
}

class Product {

    private int price;

    public int getPrice() {
        return price;
    }

    public Product(int price) {
        this.price = price;
    }
}


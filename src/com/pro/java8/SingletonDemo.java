package com.pro.java8;

final public class SingletonDemo {

    private static SingletonDemo singletonDemo;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        if (singletonDemo == null) {
            synchronized (SingletonDemo.class) {
                if (singletonDemo == null) {
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
}

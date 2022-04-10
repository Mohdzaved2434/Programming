package com.pro.java8;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(final String[] args) {

        final Map<Key, Project> map = new WeakHashMap<>();
        Key key1 = new Key("KEY1");
        final Key key2 = new Key("KEY2");

        map.put(key1, new Project(100, "Customer Management System"));
        map.put(key2, new Project(200, "Employee Management System"));

        key1 = null;
        System.gc();

        for (final Map.Entry<Key, Project> entry : map.entrySet()) {
            System.out.println(entry.getKey().getKey() + "   " + entry.getValue());
        }
    }
}

class Project {
    int price;
    String name;

    public Project(int price, String name) {
        this.price = price;
        this.name = name;
    }
}

class Key {
    private String key;

    public Key(final String key) {
        super();
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }
}





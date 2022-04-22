package com.pro.gen;

public class JavaLangObjectDemo {

    public static void checkObject() {
        Product product1 = new Product("mobile");
        Product product2 = new Product("mobile");

        System.out.println(product1.equals(product2));
        System.out.println((product1.getProductName()).equals(product2.getProductName()));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
    }

    public static void main(String[] args) {
        checkObject();
    }
}

class Product {
    String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public boolean equals(Object obj) {
        if (obj == this) { // memory location
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Product product = (Product) obj;

        return (productName == product.getProductName())
                || (productName != null && productName.equals(product.getProductName()));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        return result;
    }


}

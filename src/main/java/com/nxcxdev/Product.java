package com.nxcxdev;

public class Product {

    public static void getProduct(int number) {
        for (int i = 0; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

}

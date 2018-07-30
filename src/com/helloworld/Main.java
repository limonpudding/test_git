package com.helloworld;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world! test merge");
        System.out.println("master branch");
        System.out.println(sum(1,2,3));
        System.out.println(sub(10, 4));
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}

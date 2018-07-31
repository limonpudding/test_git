package com.helloworld;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world! test merge" + "THIS IS A NEW CONTENT IN MATER BRANCH");
        System.out.println("master branch");
        System.out.println("тест");
        System.out.println(sum(1,2,3));
        System.out.println(sub(10, 4));
        System.out.println("IntelliJ");
        System.out.println(div(10, 3));
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static float div(float a, float b) {
        return a / b;
    }
}

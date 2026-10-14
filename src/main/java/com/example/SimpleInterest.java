
package com.example;

public class SimpleInterest {
    public static double calculate(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1000, 5, 2));
    }
}

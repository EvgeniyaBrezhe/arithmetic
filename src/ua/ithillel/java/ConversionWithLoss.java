package ua.ithillel.java;

public class ConversionWithLoss {
    int a = 2_147_483_647;
    float b = a;

    public void print() {
        System.out.println("Max Integer value: " + a);
        System.out.println("Max Integer to Float value: " + b);
    }
}

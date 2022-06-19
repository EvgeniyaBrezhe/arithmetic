package ua.ithillel.java;

public class ByteOverfilled {
    byte a;
    byte b;

    public void print() {
        a = 127;
        System.out.println("Initial byte value: " + a);
        b = ++a;
        System.out.println("Incremented value: " + b);
    }
}

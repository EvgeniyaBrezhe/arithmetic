package ua.ithillel.java;

public class ConversionWithoutLoss {
    byte a = 100;
    short b = a;
    int c = b;
    long d = c;

    int e = 2_000_155_000;
    double f = e;

    short g = 32_000;
    float h = g;
    double i = h;

    char j = '\u00CA';
    int k = j;
}

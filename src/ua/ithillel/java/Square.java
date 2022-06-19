package ua.ithillel.java;

public class Square {
    int side;
    int perimeter;
    int area;
    boolean isEqual;
    String defaultString;

    public int countPerimeter(int side) {
        perimeter = side * 4;
        return perimeter;
    }

    public int countArea(int side) {
        area = side * side;
        return area;
    }

    public boolean compare() {
        if (perimeter == area) {
            return isEqual = true;
        } else {
            return isEqual = false;
        }
    }

    public void printComparison() {
        defaultString = "Is perimeter is equal to area? ";
        System.out.println(defaultString + "The answer is: " + isEqual);
    }
}

package ua.ithillel.java;

public class Main {

    public static void main(String[] args) {
        Square firstSquare = new Square();

        firstSquare.countPerimeter(2);
        firstSquare.countArea(2);
        firstSquare.compare();
        firstSquare.printComparison();

        Square secondSquare = new Square();

        secondSquare.countPerimeter(4);
        secondSquare.countArea(4);
        secondSquare.compare();
        secondSquare.printComparison();

        ConversionWithLoss exampleOfLoss = new ConversionWithLoss();
        exampleOfLoss.print();

        ByteOverfilled exampleOfByteOverfilling = new ByteOverfilled();
        exampleOfByteOverfilling.print();
    }
}

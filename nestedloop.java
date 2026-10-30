class Calculator {
    private final double first;
    private final double second;

    Calculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    void printCalculations() {
        int operation = 1;
        do {
            switch (operation) {
                case 1:
                    System.out.println("Addition: " + (first + second));
                    break;
                case 2:
                    if (second == 0) {
                        System.out.println("Division: cannot divide by zero");
                    } else {
                        System.out.println("Division: " + (first / second));
                    }
                    break;
                case 3:
                    System.out.println("Multiplication: " + (first * second));
                    break;
            }
            operation++;
        } while (operation <= 3);
    }
}

public class Main {
    public static void main(String[] args) {
        double[][] values = {{12, 4}, {9, 3}};
        int pair = 0;

        do {
            System.out.println("\nValues: " + values[pair][0] + " and " + values[pair][1]);
            Calculator calculator = new Calculator(values[pair][0], values[pair][1]);
            calculator.printCalculations();
            pair++;
        } while (pair < values.length);
    }
}

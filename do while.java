class Calculator {
    private final double first;
    private final double second;

    Calculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    void printResults() {
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
                default:
                    break;
            }
            operation++;
        } while (operation <= 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);
        calculator.printResults();
    }
}

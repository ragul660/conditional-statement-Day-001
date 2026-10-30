lass Calculator {
    private final double first;
    private final double second;

    Calculator(double first, double second) {
        this.first = first;
        this.second = second;
        printResults();
    }

    private void printResults() {
        int operation = 1;

        while (operation <= 3) {
            switch (operation) {
                case 1:
                    System.out.println("Addition: " + (first + second));
                    break;
                case 2:
                    if (second != 0) {
                        System.out.println("Division: " + (first / second));
                    } else {
                        System.out.println("Division: cannot divide by zero");
                    }
                    break;
                case 3:
                    System.out.println("Multiplication: " + (first * second));
                    break;
                default:
                    break;
            }
            operation++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Calculator(20, 5);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!\nEnter a command:");

        boolean exit = false;

        Calculator calculator = new Calculator();

        while (!exit) {
            Scanner in = new Scanner(System.in);
            boolean validInput = true;

            int[] ints;
            switch (in.next().toLowerCase()) {
                case "add":
                    ints = getValidInts(in);
                    if (ints != null) {
                        System.out.println(calculator.add(ints[0], ints[1]));
                    } else {
                        validInput = false;
                    }
                    break;
                case "subtract":
                    ints = getValidInts(in);
                    if (ints != null) {
                        System.out.println(calculator.subtract(ints[0], ints[1]));
                    } else {
                        validInput = false;
                    }
                    break;
                case "multiply":
                    ints = getValidInts(in);
                    if (ints != null) {
                        System.out.println(calculator.multiply(ints[0], ints[1]));
                    } else {
                        validInput = false;
                    }
                    break;
                case "divide":
                    ints = getValidInts(in);
                    if (ints != null) {
                        System.out.println(calculator.divide(ints[0], ints[1]));
                    } else {
                        validInput = false;
                    }
                    break;
                case "fibonacci":
                    if (in.hasNextInt()) {
                        System.out.println(calculator.fibonacciNumberFinder(in.nextInt()));
                    }
                    break;
                case "binary":
                    if (in.hasNextInt()) {
                        System.out.println(calculator.intToBinaryNumber(in.nextInt()));
                    }
                    break;
                case "exit":
                    return;
                default:
                    validInput = false;
            }

            if (!validInput) {
                System.out.println("Invalid input. Commands:\n" +
                        "\tadd # #\n\tsubtract # #\n\tmultiply # #\n\tdivide # #\n\tfibonacci #\n\tbinary #\n\texit");
            }
        }
    }

    private static int[] getValidInts(Scanner in) {
        int[] integers = new int[2];
        if (in.hasNextInt()) {
            integers[0] = in.nextInt();
            if (in.hasNextInt()) {
                integers[1] = in.nextInt();
            } else {
                return null;
            }
        } else {
            return null;
        }
        return integers;
    }
}

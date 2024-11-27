package akhil;
import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter two integers for addition:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result1 = calculator.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result1);

        System.out.println("\nEnter three integers for addition:");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int result2 = calculator.add(num3, num4, num5);
        System.out.println("Sum of " + num3 + ", " + num4 + ", and " + num5 + " is: " + result2);

        System.out.println("\nEnter two decimal numbers for addition:");
        double num6 = scanner.nextDouble();
        double num7 = scanner.nextDouble();
        double result3 = calculator.add(num6, num7);
        System.out.println("Sum of " + num6 + " and " + num7 + " is: " + result3);

        scanner.close();
    }
}


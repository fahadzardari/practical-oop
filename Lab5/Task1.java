
/*
 * Create a class having 4 functions add,sub,mul and divide
 * takes two parameters as arguments and return Sum , difference , multiplication 
 * and division.
 * Create a main class that performs these actions
 */
import java.util.*;

class Calculator {
        public double sum(double a, double b) {
                return a + b;
        }

        public double division(double a, double b) {
                return a / b;
        }

        public double multiplication(double a, double b) {
                return a * b;
        }

        public double subtraction(double a, double b) {
                return a - b;
        }

}

class Task1 {
        public static void main(String[] args) {
                Calculator calc = new Calculator();
                Scanner s = new Scanner(System.in);
                double a, b;
                String choice;
                System.out.println("Enter a number :");
                a = s.nextDouble();
                System.out.println("Enter another number : ");
                b = s.nextDouble();
                System.out.println("Enter the operation (+ , - , * , /) :");
                choice = s.next();
                switch (choice) {
                        case "+":
                                System.out.println(calc.sum(a, b));
                                break;
                        case "*":
                                System.out.println(calc.multiplication(a, b));
                                break;
                        case "/":
                                System.out.println(calc.division(a, b));
                                break;
                        case "-":
                                System.out.println(calc.subtraction(a, b));
                                break;
                        default:
                                System.out.println("hi mate wrong operator");

                }
        }

}
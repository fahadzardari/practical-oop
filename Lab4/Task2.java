/*

02. Write a java program that performs arithmetic operations on two numbers after taking 3 runtime arguments;
 1st number, 2nd number and the operators (+, -, /, *) and prints the result.

*/

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {

        char operator;
        Double n1, n2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, / or %");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        n1 = input.nextDouble();

        System.out.println("Enter second number");
        n2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;

            case '-':
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;

            case '/':
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;

            case '%':
                result = n1 % n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
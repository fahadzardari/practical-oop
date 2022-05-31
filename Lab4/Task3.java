/*

03. Write a java program which check whether a number is prime or not.



*/

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int x = input.nextInt();
        for (int i = (x - 1); i > 1; i--) {
            if (x % i == 0) {
                System.out.println("Not Prime");
                break;
            }
            if (i == 2) {
                System.out.println("Prime");
            }

        }

    }
}
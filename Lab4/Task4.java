/*

04. Write a java program that takes five subjects marks of a student and calculate their percentage and grade.


*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float total = 0;
        float perc = 0;

        System.out.println("Enter the OOP marks");
        float oop = scan.nextFloat();
        System.out.println("Enter the English marks");
        float eng = scan.nextFloat();
        System.out.println("Enter the AP marks");
        float phy = scan.nextFloat();
        System.out.println("Enter the PF marks");
        float pf = scan.nextFloat();
        System.out.println("Enter the Calculus marks");
        float calc = scan.nextFloat();
        System.out.println("Enter the total marks");
        float t = scan.nextFloat();
        total = oop + eng + phy + pf + calc;
        perc = (total / t) * 100;
        if (perc <= 50) {
            System.out.println("Your grade is C");
        } else if (perc <= 60) {
            System.out.println("Your grade is B");
        } else if (perc >= 70 || perc <= 80) {
            System.out.println("Your grade is A");
        } else if (perc >= 90 || perc <= 100) {
            System.out.println("Your grade is A+");
        }
        System.out.println("Your percentage: " + perc + "%");

    }
}

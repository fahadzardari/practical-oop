
/*

02. Write a java program to declare and initialize a double variable with a value such as 50.25.
Then retrieve the integral part and the fractional part. Display actual number, integral part and Fractional part.

*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        float number = input.nextFloat();
        int integral_part = (int) number;
        float fractional_part =  (number - integral_part);
        System.out.println("Original number = " + number);
        System.out.println("Integral part = " + integral_part);
        System.out.println("Fractional part = " + numberFormat.format(fractional_part));

    }
}
import java.util.Scanner;

/*

01. Write a java program that takes a single character as input and tells whether it is a vowel or a consonant.
 (Use Switch Statement).

*/

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any alphabet : ");
        char x = scan.next().charAt(0);
        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

            System.out.println(x + " is vowel");
            break;
            default:
            System.out.println(x + " is consonant");
        }

        scan.close();

    }

}
/*

03. Write a java program that takes an amount as runtime argument and 
prints number of bills and coins it will take to complete that amount.
 For example, if user enters Rs 5843, then the output should look like this:

Rs. 5000 1

Rs. 1000 0

Rs. 500 1

Rs. 100 3

Rs. 50 0

Rs. 20 2

Rs. 10 0

Rs. 2 1

Rs. 1 1


*/




import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
   {
   	
   	Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no of rupees: ");
        int a = scan.nextInt();
        
        System.out.println("Rs 5000 = " + a/5000);
        a %= 5000;
        System.out.println("Rs 1000 = " + a/1000);
        a %= 1000;
        System.out.println("Rs 500 = " + a/500);
        a %= 500;
	System.out.println("Rs 100 = " + a/100);
        a %= 100;
	System.out.println("Rs 50 = " + a/50);
        a %= 50;
	System.out.println("Rs 20 = " + a/20);
        a %= 20;
        System.out.println("Rs 10 = " + a/10);
        a %= 10;
        System.out.println("Rs 5 = " + a/5);
        a %= 5;
	System.out.println("Rs 2 = " + a/2);
        a %= 2;
        System.out.println("Rs 1 = " + a/1);
        




    }


}

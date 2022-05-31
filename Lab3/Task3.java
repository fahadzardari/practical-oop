/*
03. Write a java program that takes the table, 
starting and ending point of the table and prints the output in the following way: (0.3)

Enter Starting point: 3

Enter Ending point: 5

Enter Table No: 5

5x3 = 15

5x4 = 20

5x5 = 25
*/



import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int end = 0 , start =0 , no = 0;
        System.out.print("Enter Start no : ");
        start = scan.nextInt();
        System.out.print("Enter End no : ");
        end = scan.nextInt();
        System.out.print("Enter Table no : ");
        no = scan.nextInt();
        for( int i = start ; i < end+1 ; i++ ){
            System.out.println(no +  " * " + i + " = " + no*i);
               
        }
        scan.close();
    }    
}

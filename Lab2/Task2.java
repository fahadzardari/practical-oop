/*

02. Write java code that define radius for a circle and print the circumference, diameter and area for the circle.

*/ 




import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
   {
   	Scanner scan = new Scanner(System.in);
   	System.out.print("Enter radius of a circle  : ");
   	float r = scan.nextFloat();
   	
   	double circum = 2 * r * 3.1415926535897932384626;
   	double diameter = 2 * r ;
   	double area = 3.1415926535897932384626 * r * r ; 
   	System.out.println("Circumference = " + circum);
	System.out.println("Diameter = " + diameter);
	System.out.println("Area = " + area);
	scan.close();


    }


}

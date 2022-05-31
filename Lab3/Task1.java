
/*

 01. Generate a series of Odd number and even number using for and while loop.(0.2)
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Even");
        int i = 1;
        while(i < 30){
            if(i % 2 == 0 ){

                System.out.println(i);
            }
            i++;
           
        }

        System.out.println("Odd");
        i = 1;
        while(i < 30){
            if(i % 2 != 0 ){

                System.out.println(i);
            }
            i++;
            
        }
        
    }
}

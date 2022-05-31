/*

04. Generate diamond structure in java.

*/



public class Task4{
    public static void main(String[] args) {
        byte space = 4;
        for (int i =1 ; i<4 ; i++){
            for(int j = 1; j < space ;j++){
                System.out.print(" ");
            }
            for (int k = 1; k < i*2 ; k++ ){
                System.out.print("*");
            }
            System.out.println(" ");
            space--;
        }
        space = 3;
        for (int i =3 ; i>0 ; i--){
            for(int j = 1; j < space ;j++){
                System.out.print(" ");
            }
            for (int k = 3; k < i*2 ; k++ ){
                System.out.print("*");
            }
            System.out.println(" ");
            space++;
        }
          
        
    }
}
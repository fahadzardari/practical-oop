/* 
02. Generate all ACSII codes (0-255) using loops in java.(0.2)

*/



public class Task2 {
    public static void main(String[] args) {
        int i = 0;        
        do{
            System.out.print((char) i);
            i++;
        }while(i<256);
        System.out.println(" ");

    }
}

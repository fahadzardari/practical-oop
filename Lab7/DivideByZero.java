public class DivideByZero {
     public static void main(String[] args) {
        try{
                int x = 5 / 0;
                System.out.println(x);
                }
        catch(ArithmeticException e){
                System.out.println(e);
        }
     }   
}

import java.util.Scanner;

class NegativeIntegerValueException extends Exception{

        public NegativeIntegerValueException(int i){
                if(i < 0){
                        System.out.println("Negative value");
                }
        }

}

class Test {
        public static void main(String[] args) {
                try{
                        Scanner s = new Scanner(System.in);
                        System.out.print("Enter a integer : ");
                        int i = s.nextInt();

                        throw new NegativeIntegerValueException(i);

                } catch(NegativeIntegerValueException e){

                }
        }
}

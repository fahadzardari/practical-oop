
import java.util.Scanner;

class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String s){
                if(s.length() > 8){
                        System.out.println("Password length exceeds 8");
                }
                if(s.contains("*")){
                        System.out.println("Password contains *");

                }
        }
}


class Demo{
        public static void main(String[] args) {
                try {
                        Scanner s = new Scanner(System.in);
                        System.out.print("Enter your password: ");
                        String str = s.nextLine();
                        throw new InvalidPasswordException(str);
                } catch (InvalidPasswordException e) {
                        
                }
        }
}

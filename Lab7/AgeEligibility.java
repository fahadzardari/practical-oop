import java.util.Scanner;

class AgeCheck extends Exception{
        public AgeCheck(int i){
                if(i < 18){
                        NotEligible();
                }
                else{
                        Eligible();
                }
        }

        private void Eligible(){
                System.out.println("Eligible");
        }
        private void NotEligible(){
                System.out.println("Not Eligible");
        }
}
class Demo{
        public static void main(String[] args) {
                try{
                        Scanner s = new Scanner(System.in);
                        System.out.print("Enter a integer : ");
                        int i = s.nextInt();

                        throw new AgeCheck(i);

                } catch(AgeCheck e){

                }
        }
}
package Lab10;
public class EvenDelay extends Thread{
        @Override
        public void run(){
                for(int i = 0; i < 500 ; i++){
                        if(i % 2 == 0){
                                System.out.println(i);
                        }
                        if(i == 30){
                                try {
                                        System.out.println("Sleeping for 5 seconds ....");
                                        this.sleep(5000);
                                        
                                } catch (InterruptedException e) {
                                        // TODO: handle exception
                                }
                        }
                }
        }
}

class Demo{
        public static void main(String[] args) {
                EvenDelay e = new EvenDelay();
                e.start();
        }
}
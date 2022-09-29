import java.util.ArrayList;

class Even extends Thread{
        @Override
        public void run(){
                ArrayList<Integer> even = new ArrayList<>();
                for(int i = 10000; i <= 20000 ; i+=2){
                        even.add(i);
                        if(even.size() == 100){
                                break;
                        }
                }
                Square sq = new Square(even);
                // try {
                //         this.join();
                // } catch (InterruptedException e) {
                //         // TODO Auto-generated catch block
                //         e.printStackTrace();
                // }
                System.out.println(even.size());
                System.out.println("Even numbers: " + even.toString());
                sq.start();
        }
}

class Square extends Thread{
        ArrayList<Integer> even = new ArrayList<>();
        public Square(ArrayList<Integer> even){
                this.even = even;
        }
        @Override
        public void run(){
                for(int i = 0; i< even.size(); i++){
                        System.out.println(even.get(i) + "*" + even.get(i) + " = " + even.get(i)*even.get(i));
                }
        }
}

class Result{
    public static void main(String[] args) {
        Even even = new Even();
        even.start();
    }
}








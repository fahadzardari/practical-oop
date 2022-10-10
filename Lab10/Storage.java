package Lab10;

class Storage {
        private int value;

        public  void setValue(int v) {
                this.value = v;
        }

        public  int getValue() {
                return this.value;
        }
}

class Counter extends Thread {
        Storage s = new Storage();
        public Counter(Storage s){
                this.s = s;                
        }
        @Override
        public void run() {
                Printer p;
                for (int i = 0; i < 100; i++) {
                        p = new Printer(s);
                        s.setValue(i);
                        Thread.yield();
                        p.run();
                        

                }
        }

}

class Printer extends Thread {
        Storage s = new Storage();
        public Printer(Storage s){
                this.s = s;
        }
        @Override
        public void run() {
                System.out.println(s.getValue());

        }

}

class Demo2 {
        public static void main(String[] args) {
                Storage s = new Storage();
                Counter c = new Counter(s);
                c.start();
        }
}
class Mother {
                public void display(){
                        System.out.println("It's Mother class");
                }
}

class Daughter extends Mother{
                @Override
                public void display(){
                        System.out.println("It's Daughter class");
                }
}

class Example{
        public static void main(String[] args) {
                Daughter d1 = new Daughter();
                d1.display();
        }
}
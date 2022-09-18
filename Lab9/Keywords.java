class Demonstration{
        final int x = 5;
        public String name;
        Demonstration(String s){
                this.name = s;
        }

}
interface Inter{
        public void display();
}
class Inherited extends Demonstration implements Inter {
        Inherited(String s) {
                super(s);
        }

        @Override
        public void display(){
                System.out.println("Hi");
        }
} 

public class Keywords {
        public static void main(String[] args) {
                Inherited i = new Inherited("Fahad");
                i.display();
                System.out.println(i.name);
        }
}

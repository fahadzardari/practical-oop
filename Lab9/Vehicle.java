interface Vehicle{
   public String color;
   public String weight;
   public int model;
   public void accelarate();
   public void decelarate();  
   public String getColor();
   public String getWeight();
   public int getModel(); 
      

}
class Car implements Vehicle{

        @Override
        public void accelarate() {
                System.out.println("Accelarating Car");
        }

        @Override
        public void decelarate() {
                System.out.println("Decelarating Car");
        }

        @Override
        public String getColor() {
                return color;
        }

        @Override
        public String getWeight() {
                return weight;
        }
        

        @Override
        public int getModel() {
                return model;
        }
        public void setModel(int m){
                model = m;
        }
        public void setColor(String c){
                color = c;
        }
        public void setWeight(String w){
                weight = w;
        }
}

class Truck implements Vehicle{
        @Override
        public void accelarate() {
                System.out.println("Accelarating Truck");
        }

        @Override
        public void decelarate() {
                System.out.println("Decelarating Truck");
        }

        @Override
        public String getColor() {
                return color;
        }

        @Override
        public String getWeight() {
                return weight;
        }

        @Override
        public int getModel() {
                return model;
        }
        public void setModel(int m){
                model = m;
        }
        public void setColor(String c){
                color = c;
        }
        public void setWeight(String w){
                weight = w;
        }
}

class Bus implements Vehicle{
        @Override
        public void accelarate() {
                System.out.println("Accelarating Car");
        }

        @Override
        public void decelarate() {
                System.out.println("Decelarating Car");
        }

        @Override
        public String getColor() {
                return color;
        }

        @Override
        public String getWeight() {
                return weight;
        }

        @Override
        public int getModel() {
                return model;
        }
        public void setModel(int m){
                model = m;
        }
        public void setColor(String c){
                color = c;
        }
        public void setWeight(String w){
                weight = w;
        }
}

class VigoTruck extends Truck{
        public String weight = "1223kg";
        public int model = 2022;
        public String color = "black";
}
class SchoolBus extends Bus{
        public String weight = "11234kg";
        public int model = 2022;
        public String color = "Yellow";
}
class HondaCar extends Car{
        public String weight = "813kg";
        public int model = 2021;
        public String color = "White";

}

class Demo{
        public static void main(String[] args) {
                System.out.println("Working");
        }
}
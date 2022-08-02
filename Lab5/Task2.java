/*
 * Create an example at your choice which demostrate 
 * Constructor , mutators , accessors , static class members
 */

class Car{      
        static int car_issue_number_counter ;
        private String name;
        private String model;
        private String engine_name;
        private int top_speed;
        private int car_issue_number;

        public void assignIssueNumber(){

                car_issue_number_counter++;
                this.car_issue_number = car_issue_number_counter; 
                
        }
        public String getName(){
                return name;
        }
        public String getModel(){
                return model;
        }
        public String getEngine(){
                return engine_name;
        }
        public int getTopSpeed(){
                return top_speed;
        }
        public int getIssueNumber(){
                return car_issue_number;
        }
        public void setName(String n){
                this.name =n;
        }
        public void setModel(String model){
                this.model =model;
        }
        public void setEngine(String engine){
                this.engine_name =engine;
        }
        public void setTopSpeed(int top_speed){
                this.top_speed = top_speed;
        }

}


public class Task2 {
        public static void main(String[] args) {
                Car enzoFerrari = new Car();
                enzoFerrari.setName("Enzo Ferrari 12");
                enzoFerrari.setModel("1982");
                enzoFerrari.setEngine("V8 Turbo hybrid");
                enzoFerrari.setTopSpeed(250);
                enzoFerrari.assignIssueNumber();
                System.out.println("Name = " + enzoFerrari.getName());
                System.out.println("Model = " + enzoFerrari.getModel());
                System.out.println("Engine = " + enzoFerrari.getEngine());
                System.out.println("Top speed = " + enzoFerrari.getTopSpeed() + "kmh");
                System.out.println("Issue number = " + enzoFerrari.getIssueNumber());
                Car gtr = new Car();
                gtr.setName("Mercedes GTR");
                gtr.setModel("2019");
                gtr.setEngine("V12 Turbo hybrid");
                gtr.setTopSpeed(300);
                gtr.assignIssueNumber();
                System.out.println("Name = " + gtr.getName());
                System.out.println("Model = " + gtr.getModel());
                System.out.println("Engine = " + gtr.getEngine());
                System.out.println("Top speed = " + gtr.getTopSpeed() + "kmh");
                System.out.println("Issue number = " + gtr.getIssueNumber());

        }
}

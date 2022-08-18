import java.util.ArrayList;

// Develop a java program that takes 5 floating numbers as runtime arguments and 
// print their total sum and average.

public class SumAverage {
        public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                for(String a : args){
                        numbers.add(Integer.parseInt(a));
                }
                int sum = 0;
                for (Integer i : numbers){
                        sum += i;
                }
                System.out.println("Sum = " + sum);
                System.out.println("Average = " + sum/numbers.size());
        }        
}

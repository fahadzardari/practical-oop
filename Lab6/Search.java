
// Write java code that takes a value at runtime and searches it in the array. 
//  If the value appears in the array then it prints the position of the value 
//  or else prints a message that value is not found. 

class Search {
        public static void main(String[] args) {
                String[] search = {"Hello" , "Bye" , "MUET" , "Star" , "Rain"};
                boolean found = false;
                for (int i = 0 ; i < search.length ; i++){
                       if(search[i].equals(args[0])){
                                System.out.println(i);
                                found = true;
                                break;
                       }
                }
                if(!found){
                        System.out.println("Value not found");
                }


        }
}

package Aggregation;
import java.util.*;
class Human{
        private String name;
        private int age;
        private char gender;
        private String nationality;
        private University university;
	private ArrayList<Book> booksCollection;
        private ArrayList<Friend> friendsList;
        public void setName(String name){
                this.name = name ;
        }
        public void setAge(int age){
                this.age = age ;
        }
        public void setGender(char gender){
                this.gender = gender ;
        }
        public void setNationality(String nationality){
                this.nationality = nationality ;
        }
        public void setUniversity(University uni){
                this.university = uni;
        }
        public void addBook(Book book){
                this.booksCollection.add(book);
        }
        public String getName(){
                return name;
        }
        public int getAge(){
                return age;
        }
        public char getGender(){
		return gender;
        }
        public String getNationality(){
                return nationality;
        }
        public University getUniversity(){
                return university;
        }
        public void listBooks(){
                for (Book book : booksCollection) {
                        System.out.print(book.getName() + "\n");
                }
        }
        public void listFriends(){
                for (Friend friend : friendsList) {
                        System.out.print(friend.getName() + "\n");
                }
        }
}

class Check{
        public static void main(String[] args) {

        }
}






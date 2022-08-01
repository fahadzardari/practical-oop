package Aggregation;
public class Book {
        private String name;
        private String author;
        private String genre;

        public void setName(String name){
                this.name = name;
        }
        public void setAuthor(String author){
                this.author = author;
        }
        public void setGenre(String genre){
                this.genre = genre;
        }
        public String getName(){
                return name;
        }
        public String getAuthor(){
                return author;
        }
        public String getGenre(){
                return genre;
        }

}

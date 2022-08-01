
class Human{
        private String name;
        private int age;
        private char gender;
        private String nationality;
        private University university;


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



}
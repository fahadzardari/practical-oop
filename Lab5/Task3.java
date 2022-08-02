/*
 * Create a student class that stores Students data , provide methods
 * to initialize and display data.Also provide a constructor for initializing Student
 * class data members.
 */

class Student {
        private String name;
        private int age;
        private int year;
        private int roll_number;

        Student(String n, int a, int y, int r) {
                this.name = n;
                this.age = a;
                this.year = y;
                this.roll_number = r;

        }

        public void displayStudentData() {
                System.out.println("Student name: " + this.name);
                System.out.println("Student age: " + this.age);
                System.out.println("Student year of study: " + this.year);
                System.out.println("Student Roll No: " + this.roll_number);

        }

        public void setYear(int year) {
                this.year = year;
        }

        public void setRoll_number(int roll_number) {
                this.roll_number = roll_number;
        }

        public void setName(String n) {
                this.name = n;

        }

        public void setAge(int age) {
                this.age = age;
        }
}

public class Task3 {
        public static void main(String[] args) {
                Student s1, s2, s3;
                s1 = new Student("Ali Muhammed", 20, 1, 123);
                s2 = new Student("Arham", 20, 2, 13);
                s3 = new Student("Ashish", 21, 3, 23);
                s1.displayStudentData();
                s2.displayStudentData();
                s3.displayStudentData();
        }
}

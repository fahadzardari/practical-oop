import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RollNo {
        public static void main(String[] args) throws IOException {
                File file = new File("Roll.txt");
                Scanner scan = new Scanner(System.in);
                System.out.print("Write ur Roll No: ");
                String roll = scan.next();
                BufferedWriter w = new BufferedWriter(new FileWriter(file));
                w.write(roll);
                w.close();
                scan.close();
                System.out.println("Roll no successfully written in Roll.txt");
        }
}

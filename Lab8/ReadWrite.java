import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReadWrite {
        public static void main(String[] args) throws IOException {
                File file = new File("myfile.txt");
                BufferedWriter w = new BufferedWriter(new FileWriter(file));
                w.write("Hi this will be written in file called myfile.txt");
                w.close();
                BufferedReader r = new BufferedReader(new FileReader(file));
                String s;
                s  = r.readLine();
                System.out.println(s);
                r.close();
                
                
        }
}

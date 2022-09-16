import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Crud {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {     
            Object obj = parser.parse(new FileReader("MyName.json"));
            JSONArray jsonObject =  (JSONArray) obj;
            JSONObject name =(JSONObject)  jsonObject.get(1);
            System.out.println("NAME:" + name.get("name"));
            System.out.println("JOB:" + name.get("job"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
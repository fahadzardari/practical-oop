import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.json.simple.*;
import org.json.simple.parser.*;

public class Crud {
    public static void main(String[] args) throws IOException {

        File json = new File("myjson.json");
        JSONObject data1 = new JSONObject();
        JSONObject data2 = new JSONObject();
        JSONArray fullJsonData = new JSONArray();
        data1.put("name", "Fahad");
        data1.put("age", 19);
        data1.put("batch", 21);
        fullJsonData.add(data1);
        data2.put("name", "Arayan");
        data2.put("age", 18);
        data2.put("batch", 21);
        fullJsonData.add(data2);
        

        FileWriter w = new FileWriter(json);
        w.write(fullJsonData.toJSONString());
        w.close();
        
        try {     
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(json));
            JSONArray jsonObject =  (JSONArray) obj;
            for(int i = 0 ; i < jsonObject.size(); i++){

                JSONObject name =(JSONObject)  jsonObject.get(i);
                System.out.println("NAME:" + name.get("name"));
                System.out.println("AGE:" + name.get("age"));
                System.out.println("Batch:" + name.get("batch"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
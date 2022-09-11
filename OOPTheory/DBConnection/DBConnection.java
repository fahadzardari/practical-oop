import java.sql.*;

//export CLASSPATH=<.jar>:.
public class DBConnection{
        public static void main(String args[]){  
                try{  
                Class.forName("com.mysql.cj.jdbc.Driver");
                //if you have xampp  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://127.0.0.1/java","root","");  
                //if you have mysql-server installed 
                System.out.println("Connected");
                Statement st = con.createStatement();
                ResultSet result =  st.executeQuery("select * from test");
                
                while(result.next()){
                        System.out.println("ID = " + result.getInt("id") + " Name = " +result.getString("name"));
                }
                con.close();  
                }catch(Exception e){ System.out.println(e);}  
                }  
}
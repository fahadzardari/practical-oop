package Lab13;

import java.sql.*;

//export CLASSPATH=<.jar>:.
class DBConnect {

        public static boolean save(String name, String roll, String section, String batch, String country,
                        String gender, String qualification, String address) {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://127.0.0.1/json_task",
                                        "root",
                                        "");
                        PreparedStatement ps = con.prepareStatement(
                                        "INSERT INTO `student` (`name`, `batch`, `section`, `roll_no`, `gender`, `country`, `address`, `education`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                        ps.setString(1, name);
                        ps.setString(2, batch);
                        ps.setString(3, section);
                        ps.setString(4, roll);
                        ps.setString(5, gender);
                        ps.setString(6, country);
                        ps.setString(7, address);
                        ps.setString(8, qualification);
                        ps.executeUpdate();
                        con.close();
                        return true;
                } catch (Exception e) {
                        System.out.println(e);
                        return false;
                }
        }
        public static void fetch(String roll) throws ClassNotFoundException{
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://127.0.0.1/json_task",
                                        "root",
                                        "");
                        PreparedStatement ps = con.prepareStatement("SELECT * FROM student WHERE roll_no = ?");
                        ps.setString(1, roll);
                        ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                                 new print(rs.getString("name"), rs.getString("roll_no"), rs.getString("batch"), rs.getString("section"), rs.getString("gender"), rs.getString("education"), rs.getString("address"), rs.getString("country"));
                                
                        }
                        if(!rs.next()){
                                System.out.println("No data found");
                        }

        
                        con.close();
                }catch(SQLException e){
                        System.out.println(e);
                }
        }
}

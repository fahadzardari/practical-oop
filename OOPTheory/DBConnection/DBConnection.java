import java.sql.*;

//export CLASSPATH=<.jar>:.
class DBConnection extends Thread {

  public void run() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      //if you have xampp
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://127.0.0.1/java",
        "root",
        ""
      );
      //if you have mysql-server installed
      System.out.println("Connected");
      Thread.sleep(5000);

      Statement st = con.createStatement();
      ResultSet result = st.executeQuery("select * from test");
      

      while (result.next()) {
        System.out.println(
          "ID = " + result.getInt("id") + "\nName = " + result.getString("name")
        );
      }
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Demo{
        public static void main(String[] args) {
 //               Thread t = new Thread(new DBConnection());
   //             t.start();
                        DBConnection d = new DBConnection();
                        d.start();
   System.out.println("Outside Thread");
        }
}
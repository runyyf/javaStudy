package DbTest;

import java.sql.*;

/**
 * Created by runyyf on 2016-01-06.
 */
public class DbTest {

    private final static String URL = "jdbc:mysql://localhost:3306/test";
    private final static String USER_NAME = "root";
    private final static String PASSWORD = "root";
    static ResultSet rs ;

      public static void main(String[] args){
          /*
          * 加载数据库驱动
          * */
          try {
              Class.forName("com.mysql.jdbc.Driver");
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }
          /*
          * 创建数据库连接
          * */
          try {
              Connection con  = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
              Statement stmt = con.createStatement();
               boolean resultForExecute = stmt.execute("SELECT *FROM testJava WHERE id = '3' ");
              //boolean rs = stmt.execute("insert into testJava(name,score) value('zhang','4')");
              //boolean rs = stmt.execute("UPDATE  testJava SET id = '7' WHERE name = 'zhang' ");
              if (resultForExecute){
                  rs = stmt.getResultSet();
                  ResultSetMetaData rsmd = rs.getMetaData();
                  int columnCount = rsmd.getColumnCount();

                  while (rs.next()) {
                      for (int i = 0; i < columnCount; i++) {
                          System.out.print(rs.getString(i+1) + "\t");
                      }
                      System.out.println();

                  }
              }


          } catch (SQLException e) {
              //e.printStackTrace();
              System.out.println("database connect error!!!!");
          }


      }

}

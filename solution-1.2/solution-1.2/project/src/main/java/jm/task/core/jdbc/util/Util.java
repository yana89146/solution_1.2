package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url = "jdbc:mysql://localhost:3306/users";
    private static String name = "root";
    private static String password = "12345678";


  public static Connection getConnection() throws SQLException {
      Connection connection = null;
      try {
          connection = DriverManager.getConnection(url,name,password);
      }catch (SQLException e){
          throw e;
      }
      return connection;

  }
}
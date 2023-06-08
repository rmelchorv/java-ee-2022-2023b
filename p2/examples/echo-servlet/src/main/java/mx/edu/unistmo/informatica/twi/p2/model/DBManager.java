package mx.edu.unistmo.informatica.twi.p2.model;

import java.sql.Connection;
import java.sql.SQLException;

public class DBManager {

  private final String driver;
  private final String url;

  public DBManager(String driver, String url) {
    this.driver = driver;
    this.url = url;
  }

  public void closeConnection(Connection connection) {
    if (connection != null) {
      try {
        connection.close();
      } catch (SQLException e) {
        System.err.println("Error closing connection: " + e.getMessage());
      }
    }
  }

  public Connection openConnection() throws ClassNotFoundException, SQLException {
    Class.forName(driver);
    return java.sql.DriverManager.getConnection(url);
  }
}

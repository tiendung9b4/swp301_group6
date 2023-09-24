package Dal;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBContext {
    private final String DB_URL = "jdbc:mysql://localhost3306/";
    private final String USER = "root";
    private final String PASSWORD = "Hoalac@99";
    private final String DATABASE = "quiz7";
    public Connection getConnection()throws Exception 
    {         
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE,USER,PASSWORD);
    }
}

package Dal;

import Model.Account;
import Model.Lecturer;
import Model.Student;
import Model.Course;
import Model.Class;
import java.sql.Connection;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;


public class DAO extends DBContext{
Connection connector;
public DAO()
{
    try
    {
        connector = new DBContext().getConnection();
        System.out.println("Connected");
    }
    catch(Exception e)
    {
        System.out.println("Not connected");
    }
    
    
}

private Vector <Account> account;
private Vector <Student> student;
private Vector <Lecturer> lecturer;
private Vector <Course> course;
private Vector <Class> classes;
private String status = "yes";


public void loadStudent()
{
    student = new Vector();
    String sql = "select * from quiz7";
    try
        {
            PreparedStatement ps = connector.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                {
                    

                }
        }
    catch(Exception e)
        {
            status = "Error at get Student "+ e.getMessage();
        }
            }

    
public static void main(String[] args) 
{
    

}


}

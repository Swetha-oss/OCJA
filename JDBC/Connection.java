import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC
{
public static void main(String[] args) 
{
Connection con=null;
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver"); //Registering JDBC Driver for mysql
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class2", "root", "swetha060"); //Opening Connection
         // System.out.println(con);
    }
    catch (ClassNotFoundException e)
    {
    //System.out.println(e);
        e.printStackTrace();
    } 
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    
    if(con!=null)
    {
        System.out.println("Connection Established Successfully");
    }
    else
    {
        System.out.println("Connection could not be Established");
    }
}
}

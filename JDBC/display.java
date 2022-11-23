import java.sql.*;
public class Display {
Connection con=null;
Connection getConnection()
{

try
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); //Registering JDBC Driver
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class2", "root", "swetha060"); //Opening Connection
    }
    catch (ClassNotFoundException e)
    {
        e.printStackTrace();
    } 
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    return con;
}
void display()
{
if(con!=null)
{
try
{
//Scanner sc = new Scanner(System.in);
Statement stmt = con.createStatement(); //To send queries to database

String sql="select count(*)from teams";
ResultSet rs = stmt.executeQuery(sql);
//Retrieving the result
rs.next();
int count = rs.getInt(1);
System.out.println("Number of records in the cricketers_data table: "+count);
}
catch (SQLException e)
    {
        e.printStackTrace();
    }
}
}

public static void main(String[] args) {
Display cs = new Display();
        cs.getConnection();
        cs.display();

}
}

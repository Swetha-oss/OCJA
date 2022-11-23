import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class2","root","swetha060");  
	  
	PreparedStatement stmt=con.prepareStatement("update teams set name=? where rollno=?");  
	stmt.setInt(2,1);//1 specifies the first parameter in the query  
	stmt.setString(1,"uvw"); 
	 
	int i=stmt.executeUpdate();  
	
    System.out.println(i+" records updated");  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);} 
	
}
}

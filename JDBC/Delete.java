import java.sql.*;
public class Delete {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class2","root","swetha060");  
		  
		PreparedStatement stmt=con.prepareStatement("delete from teams where rollno = ?");  
		stmt.setInt(1,1);//1 specifies the first parameter in the query  
		 
		int i=stmt.executeUpdate();  
		
	    System.out.println(i+" records deleted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}   
		  
		}  
		}

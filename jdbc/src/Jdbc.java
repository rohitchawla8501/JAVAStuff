import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Jdbc {
public static void main(String[] args) throws SQLException  {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String url="jdbc:oracle:thin:@192.168.1.101:1521:orcl";
	Connection con = null;
	try {
      con=DriverManager.getConnection(url, "scott", "scott");
	System.out.println("Connected");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Statement stmt= con.createStatement();
	String r="select * from emp1234 ";
	
	/*String q="insert into emp1234 values(110,'rohit','student',10000)";
    String w ="delete from emp1234 where emp_no=10500";
	stmt.executeUpdate(w);
	System.out.println("Updated");*/
ResultSet s=stmt.executeQuery(r);
while(s.next())
{

System.out.println("ID:"+s.getInt(1)+" Employee name :"+s.getString(2)+" Employee Desig. "+s.getString(3));
s.next();
}
	
	//con.close();
stmt.close();
con.close();
}
}

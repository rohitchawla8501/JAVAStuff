package comm.seed.rsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Results1demo extends JFrame {
	JTextArea tarea1;

	Results1demo() throws SQLException {
		this.setVisible(true);
		this.setSize(700, 700);
		tarea1 = new JTextArea(100, 100);
		add(tarea1);
		/*
		 * tarea1= new JTextArea(100,100);
		 * tarea1.setText(rs.getInt(1)+" "+rs.getString(2) ); add(tarea1);
		 * //tarea1.setText(rs.getInt(1)+" "+rs.getString(2) );
		 */
	}

	public static Connection connect() throws SQLException {
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
		System.out.println("Connected");
		return conn;
	}

	public static void main(String[] args) throws SQLException {

		Connection conn = connect();

		Statement stmt = null;

		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select EMPNO,ENAME from EMP");
		rs.next();
		Results1demo r = new Results1demo();
		rs.last();
		r.text(rs);
		while(rs.previous())
		{
			
			r.text(rs);
		}

		
	}

	public void text(ResultSet rs) throws SQLException {

		/*tarea1.setText(rs.getInt(1) + " " + rs.getString(2));*/
        tarea1.append(rs.getInt(1) + " " + rs.getString(2)+"\n  ");
	}
}

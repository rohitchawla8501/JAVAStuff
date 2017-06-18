

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Connection con;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @throws ClassNotFoundException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public Connection connect() throws ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String user = "scott";
		String pswd = "scott";

		try {
			con = DriverManager.getConnection(url, user, pswd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected!!!");
		return con;

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		//Using Session
		HttpSession mySession = request.getSession();
		
		mySession.setAttribute("userNameinSession", user);
		
		// Servlet Collaboration
		String sql = "Select FIRSTNAME , PASSWORD FROM LOGIN WHERE FIRSTNAME ='"
				+ user + "' AND PASSWORD='" + password + "'";
		//try {
			/*Connection conObj = connect();
			Statement stmt = conObj.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			*///request.setAttribute("userData",rs);
			//if(rs.next()) {
				if (user.equals("admin") && password.equals("admin123")) {
					/*RequestDispatcher rd = request
							.getRequestDispatcher("UserData?userVal="+user);//URL REWRITING
					rd.forward(request, response);*/
					// out.print("Welcome to my page<font color =red>"+ user
					// +"</font>");
					
					//Using Cookie
					Cookie ck = new Cookie("username",user);
					response.addCookie(ck);	
					
					out.print("<a href=UserData>Go to User Data</a>");
					

				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("login.html");
					rd.include(request, response);
					// out.print("Wrong <font color =red>user/password </font>");
			}
			//}
			
			

		//} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

		

	}

}

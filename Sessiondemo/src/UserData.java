

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserData
 */
@WebServlet("/UserData")
public class UserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//ResultSet rs =(ResultSet)request.getAttribute("userData");
		
		//Retrieving User from Cookie
		Cookie ck[] = request.getCookies();
		System.out.println(ck);
		
		//Retrieving From Session
		HttpSession mySession = request.getSession(false);
		String userSession = (String) mySession.getAttribute("userNameinSession");
		
		
		//Using Request
		String user = request.getParameter("userVal");
		out.print("<H1>Welcome to my page</H1>" + ck[1].getValue() );
		
		out.print("<H1>Welcome to my page Cookie User </H1>" +  userSession );
		out.print("Session Id :"+mySession.getId());
		out.print("Creation Time :"+mySession.getCreationTime());
		System.out.println("In Userdata!!");
		
		
	}

}

package com.seed.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_demo
 */
@WebServlet({ "/Servlet_demo", "/rohitserver" })
public class Servlet_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Servlet_demo() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		if (user.equals("rohit") && password.equals("rohit")) {
			 /*rd = request.getRequestDispatcher("fromdemo.html");
			rd.forward(request, response);*/
			response.sendRedirect("http://www.google.com");
			/* out.print("<b>LOGIN SUCCESSFUL</b>"); */
		} 
		else {
		    rd=request.getRequestDispatcher("login.html");
			rd.include(request, response); 
			out.print("<body>LOGIN ERROR</body>");
		}
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub

	}

}

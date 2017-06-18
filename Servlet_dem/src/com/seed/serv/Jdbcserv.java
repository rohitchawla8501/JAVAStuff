package com.seed.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jdbcserv
 */
@WebServlet({ "/Jdbcserv", "/jdbc" })
public class Jdbcserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Jdbcserv() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("select *from login");

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				if (rs.getString(1).equals(user)
						&& rs.getString(2).equals(password)) {
					out.print("Login SUccessful");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("initializing");
		try {
			conn = connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection connect() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
		System.out.println("Connected");
		return conn;
	}
}

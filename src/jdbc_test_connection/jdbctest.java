package jdbc_test_connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



/**
 * Servlet implementation class jdbctest
 */


@WebServlet("/jdbctest")
public class jdbctest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	// this will define the pool connction for jdbc

	@Resource(name="jdbc/MatchRoommate")
	private DataSource dataSource;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// this will set up the printwriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		// get a connection to the database
		
		Connection myConn ;
		Statement myStmt = null;
		ResultSet myRs ;
		
		try {
			myConn = dataSource.getConnection();
			//create a SQl statement 
			String sql = "select * from questions";
			String qry1a = "SELECT CURDATE() +";
			out.println(qry1a);
			//execute SQl Query
			myRs = myStmt.executeQuery(sql);
			// process the result set
			while (myRs.next()) {
				String question = myRs.getString("question");
				System.out.println(question);
			}
			
		}
		catch (Exception e)
        {
            e.printStackTrace();
        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
	//}

}

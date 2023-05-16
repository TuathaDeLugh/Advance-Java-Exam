

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logoutservlet
 */
@WebServlet("/logoutservlet")
public class logoutservlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession sess=request.getSession();
		sess.invalidate();
		out.println("<h3>You have successfully logged out</h3>");
		out.println("Click <a href='login.html'>to login</a>");
	}
}

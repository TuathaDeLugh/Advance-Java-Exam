

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class profileservlet
 */
@WebServlet("/profileservlet")
public class profileservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			HttpSession sess=request.getSession();
			if(sess!=null) {
				String name=(String)sess.getAttribute("name");
				out.println("Welcome,"+name+"<br>");
				Cookie c[]=request.getCookies();
				String pass=c[1].getValue();
				out.println("Your password:"+pass+"<br>");
				out.println("<a href=logoutservlet>Click for logout</a>");
			}
			else {
				out.println("<h3>Please login first</h3>");
				out.println("<a href='login.html'>Click here</a>");
			}
		}
}

// you need to add login.html file for this rediraction
// Exam6
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.*;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("pass");
		if(name.equals("admin")&& password.equals("123")) {
			HttpSession sess=req.getSession();
			sess.setAttribute("name", name);
			Cookie c=new Cookie("password",password);
			res.addCookie(c);
			out.print("<h3>Welcome,"+name+"</h3>");
			out.println("<a href=profileservlet>Click here</a>");
		}
		else {
			out.print("<h3>You have entered wring password</h3>");
			out.println("<a href='login.html'>Click here</a>");
		}
	}

}

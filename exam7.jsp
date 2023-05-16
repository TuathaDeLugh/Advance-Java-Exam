<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
    <!-- <html>
<body>
<form action="p17_2.jsp" method="post">
Username:<input type="text" name="name"> <br/><br>
Password:<input type="password" name="pass"> <br/><br>
<input type="submit">
</form>
</body>
</body>
</html> -->
<%@page import="java.sql.*" %>
<%
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/db","root", "");
	Statement st = con.createStatement();
	String username=request.getParameter("name");
	String password=request.getParameter("pass");
	ResultSet rs = st.executeQuery("select * from admin where email='"+username+"' and password='"+password+"'");
	while(rs.next())
	{
		if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))){
			out.print("Welcome,"+username);
		}
		else{
			out.print("Invalid username or password");
		} 
    }  
    con.close();
}
catch (Exception ex) {
	out.print(ex);
}
%>
</body>
</html>

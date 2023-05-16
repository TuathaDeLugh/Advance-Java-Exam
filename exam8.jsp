<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
    <!-- <html>
<body>
<h1>Student's Marks Entry</h1>
<form action="p18_2.jsp" method="post">
Enter AJAVA Marks :<input type="text" name="AJAVA">
<br><br>
Enter WNS Marks :<input type="text" name="WNS">
<br><br>
Enter PHP Marks :<input type="text" name="PHP">
<br><br>
Enter Android Marks :<input type="text" name="AND">
<br><br>
Enter Project-II Marks :<input type="text" name="PRO">
<br><br>
<input type="submit">
</form>
</body>
</html> -->
<%
int AJAVA=Integer.parseInt(request.getParameter("AJAVA"));
int WNS=Integer.parseInt(request.getParameter("WNS"));
int PHP=Integer.parseInt(request.getParameter("PHP"));
int AND=Integer.parseInt(request.getParameter("AND"));
int PRO=Integer.parseInt(request.getParameter("PRO"));
int tot=AJAVA+WNS+PHP+AND+PRO;
float per=tot*100/500;
out.print("Total="+tot+"<br>");
out.print("Percentage="+per+"<br>");
if(per>80){
out.print("<h3>Distinction</h3>");
}
else if(per>70 && per<=80){
out.print("First Class");
}
else if(per>60 && per<=70){
out.print("Second Class");
}
else if(per>=40 && per<=60){
out.print("Third Class");
}
else{
out.print("Fail");
}
%>
</body>
</html>
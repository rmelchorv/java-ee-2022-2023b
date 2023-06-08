<%@ page errorPage="exception.jsp" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Implicit objects</title>
  </head>
  <body>
    <% 
      out.println("Today's date-time: " + java.util.Calendar.getInstance().getTime());
    %>
    <br>
    <% 
      String username = request.getParameter("uname");
      String password = request.getParameter("passwd");

      out.println("Name: " + username + ", Password: " + password);
    %>
    <br>
    <% 
      String pageName = page.toString();

      out.println("The current page is: " + pageName);
    %>
    <br>
    <% 
      String a = request.getParameter("a");
      String b = request.getParameter("b");
      int var1 = Integer.parseInt(a);
      int var2 = Integer.parseInt(b);
      int r = var1 / var2;

      out.print("Output is: " + r);

      if (r > 4) {
        request.setAttribute("result", r);
    %>
        <jsp:forward page="forward.jsp" />
    <%
      }
    %>
  </body>
</html>

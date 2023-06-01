<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    HttpSession currentSession = request.getSession();

    if (currentSession.getAttribute("username") == null) {
        response.sendRedirect("../index.jsp");
    } else {
%>
<html>
  <head>
    <title>Session Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <body>
    <h3>Id: <%= currentSession.getId() %></h3>
    <h3>Username: <%= currentSession.getAttribute("username") %></h3>
    </div>
  </body>
</html>
<%
    }
%>

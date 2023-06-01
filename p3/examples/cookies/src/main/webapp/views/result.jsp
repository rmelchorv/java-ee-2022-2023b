<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<%
    HttpSession currentSession = request.getSession();

    if (currentSession.getAttribute("username") == null) {
      response.sendRedirect("../index.jsp");
    } else {
      Cookie[] cookies = request.getCookies();
      String color = null;

      for (Cookie cookie : cookies)
        if (cookie.getName().equals("color"))
          color = cookie.getValue();
%>
<html>
  <head>
    <title>Cookie Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <body>
    <h3>
      Color selected:&nbsp;
      <span class="color"><%= color %></span>
    </h3>
    <h3>Id: <%= session.getId() %></h3>
    <h3>Username: <%= session.getAttribute("username") %></h3>
    </div>
  </body>
</html>
<%
    }
%>
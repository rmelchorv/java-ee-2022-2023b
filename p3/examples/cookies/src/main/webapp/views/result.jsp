<html>
  <%
      Cookie[] cookies = request.getCookies();
      String color = null;

      for (Cookie cookie : cookies)
        if (cookie.getName().equals("color"))
          color = cookie.getValue();
    %>
  <head>
    <title>Cookie Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <body>
    <h3>
      Color selected:&nbsp;
      <span class="color"><%= color %></span>
    </h3>
    </div>
  </body>
</html>
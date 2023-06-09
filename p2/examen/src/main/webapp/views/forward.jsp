<!DOCTYPE html>
<html>
  <head>
    <title>JSP Tags Example</title>
    <meta charset="UTF-8">
  </head>
  <body>
    <h2>This is the forward page using JSP Tags!</h2>
    <br>
    <%
      out.print("Result is: " + request.getAttribute("result"));
    %>
  </body>
</html>
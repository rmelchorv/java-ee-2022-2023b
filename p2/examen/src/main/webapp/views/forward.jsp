<!DOCTYPE html>
<html>
  <body>
    <h1>This is the forward page!</h1>
    <br>
    <%
      out.print("Result is: " + request.getAttribute("result"));
    %>
  </body>
</html>
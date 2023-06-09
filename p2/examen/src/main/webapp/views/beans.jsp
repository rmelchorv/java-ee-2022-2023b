<%@ page import="mx.edu.unistmo.informatica.twi.p2.models.StudenBean" %>
<!DOCTYPE html>
<html>
  <head>
    <title>JavaBeans example</title>
    <meta charset="UTF-8" />
  </head>
  <body>
    <h2>Using JavaBeans</h2>

    <jsp:useBean
      id="student"
      class="mx.edu.unistmo.informatica.twi.p2.models.StudenBean"
    />

    <jsp:setProperty name="student" property="name" value="Ricardo" />

    <h3>Name:<jsp:getProperty name="student" property="name" /></h3>
  </body>
</html>

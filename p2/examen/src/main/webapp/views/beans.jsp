<%@ page import="mx.edu.unistmo.informatica.twi.p2.models.StudenBean" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JavaBeans example</title>
    </head>
    <body>
        <h2>Beans</h2>

        <jsp:useBean id="student" class="mx.edu.unistmo.informatica.twi.p2.models.StudenBean" />

        <jsp:setProperty name="student" property="name" value="Ricardo" />

        <h3>
            Name:<jsp:getProperty name="student" property="name" />
        </h3>
    </body>
</html>
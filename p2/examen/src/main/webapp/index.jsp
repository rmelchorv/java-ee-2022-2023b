<jsp:forward url="index.html" />
<%@ page import="jsp.ejemplo.Estudiante;" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Ejemplo JSP</title>
  </head>
  <body>
    <h1>
      <%
        String nombre = request.getParameter("nombre");
        //int a = Integer.parseInt(request.getParameter("a"));
        //int b = Integer.parseInt(request.getParameter("b"));

        int filas = Integer.parseInt(request.getParameter("filas"));

        //Calculadora calc = new Calculadora(a, b);
        Estudiante estudiante = new Estudiante();
        String[] estudiantes = estudiante.obtener();

        if (nombre == null) {
          nombre = "Mundo";
        }
      %>
      <%= nombre %>
      <br>
    </h1>

    <table style="border: 1px solid black;">
      <% for (int i = 0; i < filas; i++) { %>
        <tr>
          <td>
            <%= estudiantes[i] %>
          </td>
      </tr>
      <% } %>

  </body>
</html>
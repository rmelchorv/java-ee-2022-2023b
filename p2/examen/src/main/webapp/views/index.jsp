<%@ page import="mx.edu.unistmo.informatica.twi.p2.business.EstudianteBR;" %>

<jsp:forward url="index.html" />
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Ejemplo JSP</title>
  </head>
  <body>
    <h2>
      <%
        String nombre = request.getParameter("nombre");
        //int a = Integer.parseInt(request.getParameter("a"));
        //int b = Integer.parseInt(request.getParameter("b"));

        int filas = Integer.parseInt(request.getParameter("filas"));

        //CalculadoraBR calc = new CalculadoraBR(a, b);
        EstudianteBR estudiante = new EstudianteBR();
        String[] estudiantes = estudiante.obtener();

        if (nombre == null) {
          nombre = "Mundo";
        }
      %>
      <%= nombre %>
      <br>
    </h2>

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
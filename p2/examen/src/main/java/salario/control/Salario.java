package salario.control;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Salario", urlPatterns={"/servlets/Salario"})
public class Salario extends HttpServlet
{
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
  {
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();

    String nombre = request.getParameter("nombre");
    float salario = Float.parseFloat(request.getParameter("salario"));
    float dias = Float.parseFloat(request.getParameter("dias"));

    float total = salario * dias;

    out.println(nombre + " tu salario es: " + total);
  }
}

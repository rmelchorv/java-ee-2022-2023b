package ecuaciones.control;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Ecuacion", urlPatterns={"/servlets/Ecuacion"})
public class Ecuacion extends HttpServlet
{
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
  {
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();

    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));
    int c = Integer.parseInt(request.getParameter("c"));

    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    out.println("x1 = " + x1);
    out.println("x2 = " + x2);
  }
}

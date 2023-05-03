package mx.edu.unistmo.informatica.twi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="CalcServlet", urlPatterns={ "/servlets/CalcServlet" })
public class CalcServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();

    String operation = request.getParameter("operation");
    float a = Float.parseFloat(request.getParameter("a"));
    float b = Float.parseFloat(request.getParameter("b"));
    float result = 0;

    switch(operation)
    {
      case "ADD":
        result = a + b;
        operation = "+";
        break;
      case "SUB":
        result = a - b;
        operation = "-";
        break;
      case "MUL":
        result = a * b;
        operation = "*";
        break;
      case "DIV":
        result = a / b;
        operation = "/";
        break;
    }

    String html = String.join("\n", "<!DOCTYPE html>",
      "<html lang=\"es\">",
      " <head>",
      "  <meta charset=\"UTF-8\">",
      "  <title>" + getServletName() + "</title>",
      " </head>",
      " <body>",
      "  <h1>" + getServletName() + "</h1>",
      "  <p>" + String.format(Locale.ROOT, "%.0f %s %.0f = %.1f", a, operation, b, result) + "</p>",
      " </body>",
      "</html>"
    );
    out.println(html);
  }
}

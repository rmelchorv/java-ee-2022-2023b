package mx.edu.unistmo.informatica.twi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/EchoServlet" })
public class EchoServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    
    PrintWriter out = response.getWriter();
    String html = String.join("\n", "<!DOCTYPE html>",
      "<html>",
      "  <head>",
      "    <meta charset=\"UTF-8\">",
      "    <title>EchoServlet</title>",
      "  </head>",
      "  <body>",
      "    <h1>EchoServlet is listening!</h1>",
      "    <p>Message: " + request.getParameter("message") + "</p>",
      "  </body>",
      "</html>");

    out.println(html);
  }
  
}

package mx.edu.unistmo.informatica.twi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlets/EchoServlet" })
public class EchoServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();
    String message = request.getParameter("message");

    String html = String.join("\n", "<!DOCTYPE html>",
      "<html lang=\"es\">",
      " <head>",
      "  <meta charset=\"UTF-8\">",
      "  <title>EchoServlet</title>",
      "  <style>",
      "   .blue {",
      "    color: blue;",
      "   }",
      "   .green {",
      "    color: green;",
      "   }",
      "  </style>",
      " </head>",
      " <body>",
      "  <h1 class=\"green\">EchoServlet</h1>",
      "  <p>Message: <span class=\"blue\">\"" + ((message != null) ? message : "") + "\"</span></p>",
/*      
      "  <p>Request method: " + request.getMethod() + "</p>",
      "  <p>Request URI: " + request.getRequestURI() + "</p>",
      "  <p>Request protocol: " + request.getProtocol() + "</p>",
      "  <p>Client IP: " + request.getRemoteAddr() + "</p>",
      "  <p>Client port: " + request.getRemotePort() + "</p>",
      "  <p>Server name: " + request.getServerName() + "</p>",
      "  <p>Server port: " + request.getServerPort() + "</p>",
      "  <p>Servlet name: " + getServletName() + "</p>",
      "  <p>Servlet info: " + getServletInfo() + "</p>",
*/
      " </body>",
      "</html>"
    );

    out.println(html);
  }
  
}

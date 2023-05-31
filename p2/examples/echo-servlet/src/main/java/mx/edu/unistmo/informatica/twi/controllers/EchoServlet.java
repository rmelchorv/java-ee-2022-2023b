package mx.edu.unistmo.informatica.twi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="EchoServlet", urlPatterns = { "/servlets/EchoServlet" })
public class EchoServlet extends HttpServlet
{
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
      "  <title>" + getServletName() + "</title>",
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
      "  <h1 class=\"green\">" + getServletName() + "</h1>",
      "  <p>Message: <span class=\"blue\">\"" + ((message != null) ? message : "") + "\"</span></p>",
      " </body>",
      "</html>"
    );
    out.println(html);
  }
}

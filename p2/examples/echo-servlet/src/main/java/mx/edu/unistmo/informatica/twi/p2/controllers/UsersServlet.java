package mx.edu.unistmo.informatica.twi.p2.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.unistmo.informatica.twi.p2.model.DBManager;

@WebServlet(name="UsersServlet", urlPatterns={ "/servlets/UsersServlet" })
public class UsersServlet extends HttpServlet
{
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();

    DBManager dbManager = new DBManager("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/twi");

    try {
      dbManager.openConnection();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      dbManager.closeConnection(null);
    }

    String html = String.join("\n", "<!DOCTYPE html>",
      "<html lang=\"es\">",
      " <head>",
      "  <meta charset=\"UTF-8\">",
      "  <title>" + getServletName() + "</title>",
      " </head>",
      " <body>",
      "  <h1>" + getServletName() + "</h1>",
      "  <p>" + request.getAttribute("ATTR-1") + "</p>",
      "  <p>" + request.getAttribute("ATTR-2").toString() + "</p>",
      "  <p>" + request.getAttribute("ATTR-3") + "</p>",
      " </body>",
      "</html>"
    );

    out.println(html);
  }
}
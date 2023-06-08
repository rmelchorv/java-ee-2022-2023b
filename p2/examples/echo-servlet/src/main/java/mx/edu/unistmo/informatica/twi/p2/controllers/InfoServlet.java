package mx.edu.unistmo.informatica.twi.p2.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="InfoServlet", urlPatterns={ "/servlets/InfoServlet" })
public class InfoServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();

    String html = String.join("\n", "<!DOCTYPE html>",
      "<html lang=\"es\">",
      " <head>",
      "  <meta charset=\"UTF-8\">",
      "  <title>" + getServletName() + "</title>",
      " </head>",
      " <body>",
      "  <h1>" + getServletName() + "</h1>",
      "  <table>",
      "   <caption>Servlet information</caption>",
      "   <thead>",
      "     <tr>",
      "       <th>Field</th>",
      "       <th>Value</th>",
      "     </tr>",
      "   </thead>",
      "   <tbody>",
      "     <tr>",
      "       <td>Request method:</td>",
      "       <td>" + request.getMethod() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Request URI:</td>",
      "       <td>" + request.getRequestURI() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Request protocol:</td>",
      "       <td>" + request.getProtocol() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Client IP:</td>",
      "       <td>" + request.getRemoteAddr() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Client port:</td>",
      "       <td>" + request.getRemotePort() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Server name:</td>",
      "       <td>" + request.getServerName() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Server port:</td>",
      "       <td>" + request.getServerPort() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Servlet name:</td>",
      "       <td>" + getServletName() + "</td>",
      "     </tr>",
      "     <tr>",
      "       <td>Servlet info:</td>",
      "       <td>" + getServletInfo() + "</td>",
      "     </tr>",
      "   </tbody>",
      "   <tfood>",
      "     <tr>",
      "       <th>&nbsp;</th>",
      "       <th>&nbsp;</th>",
      "     </tr>",
      "   </tfood>",
      "  </table>",
      " </body>",
      "</html>"
    );
    out.println(html);
  }
  @Override
  public String getServletInfo() 
  {
    return "InfoServlet, shows some information about the request and the servlet itself.";
  }
}

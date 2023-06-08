package mx.edu.unistmo.informatica.twi.p3.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="CookieServlet", urlPatterns = { "/cookies/CookieServlet" })
public class CookieServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    String color = request.getParameter("color");

    Cookie cookieColor = new Cookie("color", color);

    /*
    cookieColor.setMaxAge(60 * 60 * 24 * 365 * 2); // 2 years
    */

    response.addCookie(cookieColor);

    request.getRequestDispatcher("../views/result.jsp").forward(request, response);
  }

}
package mx.edu.unistmo.informatica.twi.p3.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name="SessionServlet", urlPatterns={ "/sessions/SessionServlet" })
public class SessionServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    HttpSession session = request.getSession();

    session.setAttribute("username", request.getParameter("username"));

    request.getRequestDispatcher("../views/session-info.jsp").include(request, response);
  }

}

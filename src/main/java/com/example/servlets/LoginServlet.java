package com.example.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("admin".equals(user) && "admin123".equals(pass)) {
            out.println("<h2>Welcome, " + user + "!</h2>");
        } else {
            out.println("<h2>Invalid credentials. Try again.</h2>");
        }
    }
}


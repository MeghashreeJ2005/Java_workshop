package com.xworkz.playo.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class  PlayoServlet  extends HttpServlet {

    public PlayoServlet() {
        System.out.println("PlayoApplicationServlet created - now it can handle requests and respond.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doGet method invoked");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doPost method invoked");

        String username = req.getParameter("username");
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");
        String numberOfPlayers = req.getParameter("numberOfPlayers");

        System.out.println("Username: " + username);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Number of Players: " + numberOfPlayers);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.print("<html>");
        writer.print("<head><title>Playo Application</title></head>");
        writer.print("<body>");
        writer.print("<h1>Entered Details:</h1>");
        writer.print("<h2>Username: " + username + "</h2>");
        writer.print("<h2>Contact Number: " + contactNumber + "</h2>");
        writer.print("<h2>Email: " + email + "</h2>");
        writer.print("<h2>Number of Players: " + numberOfPlayers + "</h2>");
        writer.print("</body>");
        writer.print("</html>");
    }
}

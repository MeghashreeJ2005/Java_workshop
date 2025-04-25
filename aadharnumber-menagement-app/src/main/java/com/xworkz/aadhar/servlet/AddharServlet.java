package com.xworkz.aadhar.servlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")

public class AddharServlet extends HttpServlet {

    public AddharServlet() {
        System.out.println("Aadhar Servlet created now it can handle the "+"request and respond");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet method invoked");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("dopost method invoked");
        String username = req.getParameter("username");
        System.out.println("user name is: "+username);
        String aadharNumber=req.getParameter("aadharNumber");
        System.out.println("aadharcard Number is: "+aadharNumber);


        PrintWriter write=resp.getWriter();
        resp.setContentType("text/html");
        write.print("<html>");
        write.print("<head>");
        write.print("<title>Aadhar card</title>");
        write.print("</head>");
        write.print("<body>");
        write.print("<h1>"+"entered details is:"+"</h1>");
        write.print("<h2>"+username+"</h2>");
        write.print("<h2>"+aadharNumber+"</h2>");
        write.print("</body>");
        write.print("</html>");
    }

}
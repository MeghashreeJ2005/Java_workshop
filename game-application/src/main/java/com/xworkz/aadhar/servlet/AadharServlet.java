package com.xworkz.aadhar.servlet;

import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class AadharServlet extends HttpServlet {
 public AadharServlet(){
     System.out.println("AadharServlet created now it can handle the"+"request and response");
 }
 @Override
    public void doGet(HttpServletRequest rq,HttpServletResponse resp){
     System.out.println("doGet method invoked");
 }

    public void dopost(HttpServletRequest req,HttpServletResponse response){
        System.out.println("dopost method invoked");
        String userName = req.getParameter("username");
        System.out.println("user name is:"+userName);

        String aadharNumber= req.getParameter("username");
        System.out.println("aadharNumber is:"+aadharNumber);

    }
}

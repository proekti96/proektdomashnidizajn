//package com.app.das.web.servlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet(name = "home servlet", urlPatterns = "/home")
//public class HomeServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        PrintWriter pw = resp.getWriter();
//        pw.println("<html>");
//        pw.println("<body>");
//        pw.println("<h1>");
//        pw.println("Welcome to emt");
//        pw.println("</h1>");
//        if (name != null) {
//            pw.println(String.format("<h2> Hello %s </h2>", name));
//        }
//        pw.println("</body>");
//        pw.println("</html>");
//        pw.flush();
//    }
//}


//package com.app.das.web.servlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebServlet(name = "login servlet", urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//
//    List<String> validUsernames;
//
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        this.validUsernames = new ArrayList<>();
//        this.validUsernames.add("emtUser");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter pw = resp.getWriter();
//        pw.println("<html>");
//        pw.println("<body>");
//        pw.println("<form method=\"POST\" action=\"/login\">");
//        pw.println("<input type=text name=\"username\" />");
//        pw.println("<input type=submit />");
//        pw.println("</form>");
//        pw.println("</body>");
//        pw.println("</html>");
//        pw.flush();
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        if (username != null && this.validUsernames.contains(username)) {
//            req.getSession().setAttribute("username", username);
//            resp.sendRedirect("/home");
//        } else {
//            resp.sendRedirect("/login");
//        }
//    }
//
//
//}
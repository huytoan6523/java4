package com.example.java4;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Add") //đường dẫn
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        String name ="toan 1";
//        request.setAttribute("hoTen",name);
//
//        request.getRequestDispatcher("/views/hello.jsp")
//                .forward(request,
//                        response);


        request.getRequestDispatcher("/views/KhachHang/Create.jsp")
                .forward(request,
                        response);
    }

    public void destroy() {
    }
}
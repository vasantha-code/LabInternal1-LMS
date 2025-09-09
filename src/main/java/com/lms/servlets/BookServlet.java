package com.lms.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form inputs
        String studentId = request.getParameter("studentId");
        String bookId = request.getParameter("bookId");
        String action = request.getParameter("action");

        // Set response type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display confirmation page
        out.println("<html><body>");
        out.println("<h2>Library Transaction Result</h2>");
        out.println("<p><b>Student ID:</b> " + studentId + "</p>");
        out.println("<p><b>Book ID:</b> " + bookId + "</p>");

        if ("issue".equalsIgnoreCase(action)) {
            out.println("<p style='color:green;'>✅ Book has been issued successfully.</p>");
        } else if ("return".equalsIgnoreCase(action)) {
            out.println("<p style='color:blue;'>📘 Book has been returned successfully.</p>");
        } else {
            out.println("<p style='color:red;'>❌ Invalid action.</p>");
        }

        out.println("<br><a href='bookForm.jsp'>Go Back</a>");
        out.println("</body></html>");
    }
}

package servlet;

import dao.StudentDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ListStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students", new StudentDAO().getAll());
        req.getRequestDispatcher("list-students.jsp").forward(req, resp);
    }
}

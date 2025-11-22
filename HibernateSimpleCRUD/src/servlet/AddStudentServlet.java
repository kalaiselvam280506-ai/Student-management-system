package servlet;

import dao.StudentDAO;
import entity.Student;
import javax.servlet.http.*;
import java.io.IOException;

public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        new StudentDAO().addStudent(new Student(name, email));
        resp.sendRedirect("list");
    }
}

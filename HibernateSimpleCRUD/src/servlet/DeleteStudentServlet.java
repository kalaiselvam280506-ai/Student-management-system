package servlet;

import dao.StudentDAO;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        new StudentDAO().delete(id);
        resp.sendRedirect("list");
    }
}

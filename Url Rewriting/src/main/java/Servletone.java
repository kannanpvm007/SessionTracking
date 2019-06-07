import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Servletone extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");
            PrintWriter pw= resp.getWriter();
            String n= req.getParameter("user");
            pw.print("welcome" + n);
            pw.print("<a href='servlet2?uname="+n+"'>Visit</a>");
pw.close();




        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    }

}
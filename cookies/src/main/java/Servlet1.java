
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet1 doget called");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String n = req.getParameter("userName");
        out.print(n);

        Cookie ck = new Cookie("userName", n);
        
        resp.addCookie(ck);

        out.print("<form action='/Servlet2'>");
        out.print("<input type='submit' value='continue'>");
        out.print("</form>");

        // out.println("<form action='servlet2.jsp'>");
        // RequestDispatcher rd=req.getRequestDispatcher("/Servlet2.jsp");
        // rd.forward(req, resp);
        out.close();
    }

}
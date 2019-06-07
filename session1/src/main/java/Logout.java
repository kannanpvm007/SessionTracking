import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("logout");

        resp.setContentType("text/html");
        PrintWriter pw= resp.getWriter();
        pw.print("good bye");
        HttpSession hs= req.getSession(true);
        hs.removeAttribute("user");
hs.getMaxInactiveInterval();

    }

    
}
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// import org.omg.CORBA.Request;

/**
 * Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("login (JAVA)called");
      
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        String un= req.getParameter("un");
        //String ps=req.getParameter("psw");
        
        if(un.equals("java")){
            pw.print("welcome"+un);
            System.out.println("loop");
            HttpSession session= req.getSession(true);
            session.setAttribute("user", un);
            session.setMaxInactiveInterval(10);
            resp.setIntHeader("Login", 5);
            resp.sendRedirect("home.jsp");
          
           
            
        }
        else{
            System.out.println("login out");
            RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
            pw.print("<font color='red'> worng login </font>");
            rd.include(req, resp);
           
          
        }
    }

    
}
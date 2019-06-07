import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")

public class Servlet2 extends HttpServlet{
    private static final long serialVersionUID = 1L;


      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
      resp.setContentType("text/html");
      PrintWriter pw= resp.getWriter();
      String h = req.getParameter("uname");

      pw.print("welcome (url)"+h);    
      pw.close();     

     
      



    }

}
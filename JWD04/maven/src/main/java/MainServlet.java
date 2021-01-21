




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index")
public class MainServlet extends HttpServlet {



        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         /*    request.getRequestDispatcher("index.jsp").forward(request, response);
            response.setContentType("text/html");
           resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();
            printWriter.write("Hello!");
            printWriter.close();*/
        }
    }
    //@Override
    //protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  request.getRequestDispatcher("/page.jsp").forward(request, response);
    //}
//}


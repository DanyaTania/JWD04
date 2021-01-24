import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

@WebServlet(urlPatterns = "/sss")
public class Sss extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Sss:Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirectURL = //"https://sharednl.buxar-host.eu:2083/cpsess3611446717/frontend/paper_lantern/index.html?login=1&post_login=62954427486690";
               "https://sharednl.buxar-host.eu:2083/logout?";//
        response.sendRedirect(redirectURL);
        //request.getRequestDispatcher("index.jsp").forward(request, response);
        //response.setContentType("text/html");}
        //@Override
        //protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("get method sss servlet");
        //  }
        // }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post method sss servlet");

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        String login = null;
        Principal usernamePrincipal = req.getUserPrincipal();
        if (usernamePrincipal != null)
            login = usernamePrincipal.getName();

        printWriter.println(login);
    }

}

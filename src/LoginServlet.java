import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");


        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        PrintWriter writer = response.getWriter();

        if (user.equals("admin") && pass.equals("admin")) {
            writer.print("Zalogowano pomyślnie!!!");
        } else {
            writer.print("niestety nie możesz się  zalogować");
        }
    }


}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/textcalc")
public class TextCalcServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String text = request.getParameter("text");

        PrintWriter writer = response.getWriter();
        writer.print("W tekście występuje: <br/>" + text.length() + " znaków");

        String[] words = text.split(" ");

        writer.print("<br/>" + words.length + " wyrazów");

        String string = "";
        for (String word : words) {
            string += word;
        }

        string = string.toLowerCase();
        writer.print("<br/>" + string);
        writer.print("<br/>" + string.length() + " znaków bez spacji");

        Boolean isPalindrom = false;
        for (int i = 0; i < string.length(); i++){

                if (string.charAt(i) != string.charAt(string.length()-1-i)) {
                    isPalindrom = false;
                    break;
                } else isPalindrom = true;
        }
        writer.print("<br/> czy tekst jest palindromem: " + String.valueOf(isPalindrom));

    }


}

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    public MyServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>GET запрос</h1>");
        out.println("<p>Привет, это пример простого GET-запроса!</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8"); // Установите кодировку UTF-8

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>POST запрос</h1>");
        out.println("<p>Привет, это пример простого POST-запроса!</p>");

        // Получение данных из запроса POST
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // Вывод данных из запроса
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");

        out.println("</body></html>");
    }

}

package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/Web-INF/views/new-form.jsp";//컨트롤러를 거쳐서 내부에서 포워드하도록 하는 룰이다.
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
        //서버 내부에서 다시 호출이 발생한다. 클라이언트에 다시 왔다갔다 하는 것이 아니다.
        //포워드와 리다이렉트는 다르다. 리다이렉트는 클라이언트에서 두 번 호출이 일어나고 포워드는 한번이다.
    }
}

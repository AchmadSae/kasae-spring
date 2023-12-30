package sae.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/unsafe")
public class unsafeServlet extends HttpServlet {

//    private String response =""; unsafe
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String response = "Hello "+req.getParameter("name");
        Long sleep = Long.parseLong(req.getParameter("sleep"));

        try{
            Thread.sleep(sleep);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        resp.getWriter().println(response);
    }
}

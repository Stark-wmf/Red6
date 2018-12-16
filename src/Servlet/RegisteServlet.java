package Servlet;

import dao.DAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/registe.do")
public class RegisteServlet extends HttpServlet {
    @Override
//doGet方法自动跳转到doPost()方法
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
req.setCharacterEncoding("utf-8");//设置编码格式为utf-8
String username=req.getParameter("username");//从注册界面获得username
String password=req.getParameter("password");//从注册界面获得password
DAO.registe(username, password);
    req.getRequestDispatcher("login.jsp").forward(req, resp); //重新跳转到登录界面


     }
}




package Servlet;

import dao.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码格式为utf-8
        String username = req.getParameter("username");//从jsp中获取usernmae
        if(username == null){
            System.out.println("username null");
        }
        String password = req.getParameter("password");//从jsp中获取password
        if (DAO.checkLogin(username, password)) { //dao层中判断，如果为true，跳转到欢迎界面
req.setAttribute("username", username);
req.getRequestDispatcher("sucess.jsp").forward(req, resp);
        }else{   //如果为false，跳转到登录界面，并返回错误信息.
            req.setAttribute("inf", "你的账号或密码错误，请重新登录");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }


    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import beans.Login;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.LoginService;

/**
 *
 * @author OTTO
 */
@WebServlet(urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private LoginService ss = new LoginService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("op") != null) {
            System.out.println("bien ");
            if (request.getParameter("op").equals("log")) {
                // Login l=new Login();
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                // l=ss.findAlls(username, password);
                LoginService lgs = new LoginService();
                List<Login> login = lgs.findAll();
                int cpt = 0;
                Login user = new Login();
                for (Login log : login) {
                    if (log.getUser().equals(username) && log.getPass().equals(password)) {
                        user.setId(log.getId());
                        user.setUser(log.getUser());
                        user.setPass(log.getPass());
                        cpt++;
                    }
                }
                System.out.println(cpt);

                if (cpt > 0) {
                    String msg = "1";

                    response.setContentType("application/json");

                    Gson json = new Gson();

                    response.getWriter().write(json.toJson(msg));

                }

            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

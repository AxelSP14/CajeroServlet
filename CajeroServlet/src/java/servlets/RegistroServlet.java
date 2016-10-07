/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author Alumno
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistroServlet extends HttpServlet {
    String user;
    String pass;
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        user = req.getParameter("user");
        pass = req.getParameter("pass");
        if (user.equals(user) && pass.equals(pass)) {
			response(res, "logeo correcto");
		} else {
			response(res, "logeo incorrecto");
		}
    }
    private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center><h3>Has sido registrado como: "+ user+"</h3>"
                        + "<br><br>"
                        + "</center>");
		out.println("</body>");
		out.println("</html>");
	}
}

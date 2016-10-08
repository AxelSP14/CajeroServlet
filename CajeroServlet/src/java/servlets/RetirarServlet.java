/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RetirarServlet extends HttpServlet {
    AbonarServlet abo = new AbonarServlet();   
    
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
        abo.monto = abo.monto - Integer.parseInt(req.getParameter("retiro"));
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>"
                + "<body>"
                + "<div>"
                + "<center>"
                + "<h1>Retiro exitoso</h1><br><br>"
                + "<h2>Ahora te quedan: $ "+ abo.monto +".00 en tu cuenta</h2>"
                + "</center>"
                + "</div>"
                + "</body>");
    }
}


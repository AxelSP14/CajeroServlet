/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbonarServlet extends HttpServlet {
    public int monto;
    public int montopasado;
    public int actual;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
        montopasado = monto;
        actual = Integer.parseInt(req.getParameter("cantidad"));
        monto = monto+Integer.parseInt(req.getParameter("cantidad"));
        if(monto == (montopasado+Integer.parseInt(req.getParameter("cantidad")))){
            response(res, "Actualizado");
        }
    }
    public void response(HttpServletResponse resp, String msg)
            throws IOException{
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Respuesta</title></head>");
        out.println("<body>"
                + "<center><h3>Se ha registrado el monto de: $"+actual+" pesos</h3>"
                + "<h3>Tu saldo actual es de: $"+ (monto) +"</center>"
                + "</body></html>");
        
        
        
    }
}

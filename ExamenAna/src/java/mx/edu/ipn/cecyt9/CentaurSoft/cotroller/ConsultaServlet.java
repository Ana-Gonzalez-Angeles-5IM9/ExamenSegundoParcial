/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.CentaurSoft.cotroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.CentaurSoft.model.Registro;
import mx.edu.ipn.cecyt9.CentaurSoft.utils.Conexion;

/**
 *
 * @author Sara
 */
public class ConsultaServlet extends HttpServlet {

    private Connection conex;
    private ResultSet res = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConsultaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        Registro r = null;

        final String INSERT = "select * from informacion;";
        
        try {
            res = con.query(INSERT);

            while (res.next()) {
                r = new Registro();
                r.setIdInformacion(res.getInt("idInformacion"));
                r.setNombre(res.getNString("nombre"));
                r.setApellidom(res.getNString("apellidop"));
                r.setApellidop(res.getNString("apellidom"));
                r.setDeportefav(res.getNString("deportefav"));
                r.setEscuela(res.getNString("escuela"));
                r.setMateriafav(res.getNString("materiafav"));

                System.out.println("se encontraron los registros");
            }
            conex.close();
        } catch (Exception eee) {
            System.out.println("No se encontraron los registros" + eee.getMessage());
        }
        getServletContext().getRequestDispatcher("/jsp/consulta.jsp").forward(request, response);
        processRequest(request, response);
    }
        
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    }// </editor-fold>

}

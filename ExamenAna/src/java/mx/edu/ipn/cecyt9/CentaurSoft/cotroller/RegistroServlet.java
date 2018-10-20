/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.CentaurSoft.cotroller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.CentaurSoft.utils.Conexion;

/**
 *
 * @author AnaGonzález
 */
public class RegistroServlet extends HttpServlet {

    private Connection conex;


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
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        String nombre="";
        String apellidom="";
        String apellidop="";
        String escuela="";
        String materiafav="";
        String deportefav="";
        String ubi;
        String telefono;

        final String INSERT = "insert into informacion(nombre,apellidop,apellidom,escuela,materiafav,deportefav, ubi, telefono) values(?,?,?,?,?,?,?,?);";

        nombre = request.getParameter("nombre");
        apellidom = request.getParameter("apellidom");
        apellidop = request.getParameter("apellidop");
        escuela = request.getParameter("escuela");
        materiafav = request.getParameter("materiafav");
        deportefav = request.getParameter("deportefav");
        ubi = request.getParameter("ubi");
        telefono = request.getParameter("telefono");
        

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conex.prepareStatement(INSERT);
            stmt.setString(1, nombre);
            stmt.setString(2, apellidop);
            stmt.setString(3, apellidom);
            stmt.setString(4, escuela);
            stmt.setString(5, materiafav);
            stmt.setString(6, deportefav);
            stmt.setString(7, ubi);
            stmt.setString(8, telefono);


            if (stmt.executeUpdate() == 0) {
                System.out.println("Algo no se hizo bien en el registro"); 
            }
            conex.close();
        } catch (Exception eee) {
            System.out.println("error al realizar registro" + eee.getMessage());
        }
        response.sendRedirect("jsp/consulta.jsp");
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

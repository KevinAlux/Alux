/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controlador.Consultas;
import FactoriadeUsuarios.*;

/**
 *
 * @author Kevin
 */
public class Registros extends HttpServlet {

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
        FactoriaUsuarios factoria = FactoriaUsuarios.getFactoria();
        factoria.agregarUsuario(request.getParameter("user"), request.getParameter("password"), request.getParameter("nacimiento"), request.getParameter("email"), request.getParameter("usertype"), Integer.parseInt(request.getParameter("userid")), Integer.parseInt(request.getParameter("employeenumber")), request.getParameter("nombre"), request.getParameter("suscriptiontype"), request.getParameter("address"), request.getParameter("registerdate"));

        String user = factoria.obtenerUsuario(request.getParameter("user")).getNombreDeUsuario();
        String password = factoria.obtenerUsuario(request.getParameter("user")).getPassword();
        String birthdate = factoria.obtenerUsuario(request.getParameter("user")).getFechaDeNacimiento();
        String email = factoria.obtenerUsuario(request.getParameter("user")).getEmail();
        String usertype = factoria.obtenerUsuario(request.getParameter("user")).getTipoDeUsuario();
        int userid = factoria.obtenerUsuario(request.getParameter("user")).getId();
        int employeenumber = 0;
        String name = null;
        String suscriptiontype = null;
        String address = null;
        String registerdate = null;
        
        if (usertype.equals("Administrador")){
            employeenumber = ((UsuarioAdministrador)factoria.obtenerUsuario(request.getParameter("user"))).getNumTrabajador();
        }else if (usertype.equals("Normal")) {
            name = ((UsuarioNormal)factoria.obtenerUsuario(request.getParameter("user"))).getNombre();
            suscriptiontype = ((UsuarioNormal)factoria.obtenerUsuario(request.getParameter("user"))).getTipoDeSuscripcion();
            address = ((UsuarioNormal)factoria.obtenerUsuario(request.getParameter("user"))).getDireccion();
        }else if (usertype.equals("Invitado")) {
            name = ((UsuarioInvitado)factoria.obtenerUsuario(request.getParameter("user"))).getNombre();
            registerdate = ((UsuarioInvitado)factoria.obtenerUsuario(request.getParameter("user"))).getFechaDeRegistro();
        }
        
        
        Consultas co = new Consultas();
        if(co.registrar(user, password, birthdate, email, usertype, userid, employeenumber, name, suscriptiontype, address, registerdate)){
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("Registro.jsp");
        }
        
        
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

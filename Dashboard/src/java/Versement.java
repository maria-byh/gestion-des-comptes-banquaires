/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**

 *
 * @author ibelm
 */
@WebServlet(urlPatterns = {"/effectuerVersement"})
public class Versement extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numCompte = request.getParameter("numCompte");
        String typeCompte = request.getParameter("typeCompte");
        String dateCreation = request.getParameter("dateCreation");
        String solde = request.getParameter("solde");
        String numEmploye = request.getParameter("numEmploye");
        String codeClient = request.getParameter("codeClient");

        
        
        
        
        RequestDispatcher rd = request.getRequestDispatcher("operation.html");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Use inline CSS to set the background color to green
        out.println("<html><body>");
        out.println("<div style='background-color:#4CAF50; padding: 1px; text-align: center;'>");
        out.println("<h1 style='color:#ffffff;'>Versement avec Succès</h1>");
        out.println("</div>");
        out.println("</body></html>");

        rd.include(request, response);
    }

}

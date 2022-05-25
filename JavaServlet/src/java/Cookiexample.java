/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(urlPatterns = {"/Cookiexample"})
public class Cookiexample extends HttpServlet {

    private static final long serialVersionUID = 102831973239L;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        try {

            String name = req.getParameter("name");

            Cookie ck = new Cookie("name", name);
            res.addCookie(ck);

        } catch (Exception e) {
            System.out.println("ERRPR !" + e.getMessage());
        }
        Cookie ck[] = req.getCookies();
        if (ck != null) {
            String name = ck[0].getValue();
            if (!name.equals("") || name != null) {
                out.print("<h5>Welcome to Profile</h5>");
                out.print("<h1>Welcome, " + name + "</h1>");
            }
            out.close();
        }
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

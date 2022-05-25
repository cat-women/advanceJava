/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(urlPatterns = {"/FileHandling"})
public class FileHandling extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        String pwd = req.getParameter("pwd");
        String dob = req.getParameter("dob");
        try {
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dob"));
        } catch (ParseException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        File userFile = new File("D://java/user.txt");
        boolean iscreated = userFile.createNewFile();

        BufferedWriter out = new BufferedWriter(new FileWriter(userFile));

        out.write("name:\t " + name
                + "\n email: \t" + email
                + "\n contact: \t" + contact
                + "\n pwd: \t" + pwd
                + "\n dob: \t" + dob
        );
        out.close();
        System.out.println("data added successfully ");
        
//        
//        String detail = "Name : " + name + "\n  Email: " + email + "\n phone no :" + contact + "\n password: " + pwd;
//        File file = new File("D:\\java\\JavaServlet\\registration.txt");
//        try {
//            file.exists();
//            FileWriter fw = new FileWriter(file, true);
//            fw.append(detail);
//            fw.close();
//            write.write("new registration ");
//        } catch (Exception e) {
//            write.write("Error  " + e.getMessage());
//
//        }

    }
    

}

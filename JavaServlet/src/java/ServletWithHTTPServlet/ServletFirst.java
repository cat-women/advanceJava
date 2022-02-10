/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletWithHTTPServlet;

import java.beans.Statement;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class ServletFirst extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        ArrayList<String> names = new ArrayList<>();
        names.add("cat");
        names.add("dog");
        names.add("tiger");

        PrintWriter write = response.getWriter();

        if (name.equals("")) {
            write.write("name is empty");
        } else {
            for (String pet : names) {
                if (pet.equals(name)) {
                    write.write("this is cat");
                    break;
                } else {
                    write.write("this is other animal ");
                    break;

                }
            }
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter write = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String contact = request.getParameter("contact");
        String checkme = request.getParameter("checkme");

        String detail = "Name : " + name + "\n  Email: " + email + "\n phone no :" + contact + "\n password: " + pwd;
        File file = new File("D:\\java\\JavaServlet\\registration.txt");
        try {
            file.exists();
            FileWriter fw = new FileWriter(file, true);
            fw.append(detail);
            fw.close();
            write.write("new registration ");
        } catch (Exception e) {
            write.write("Error  " + e.getMessage());

        }

    }

}

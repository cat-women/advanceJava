/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletWithHTTPServlet;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JDBCConnection {

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        String url = "jdbc:mysql://localhost:3306/db_vaccinationsystem";
        String sql;
        ResultSet rs;

        System.out.println("this is jdbc connection");
        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            stmt = con.createStatement();

            String exit = "";
            while (!exit.equals("exit")) {
                System.out.println("action");
                System.out.println("show -> show all data \n Insert -> insert new data \n Delete -> to delte \n Updata -> to update \n exit-> to teminate prpgram  ");

                String req = sc.next();
                exit = req;
                switch (req) {
                    case "insert":
                        System.out.println("Enter name");
                        String name = sc.next();

                        System.out.println("Enter email");
                        String email = sc.next();
                        System.out.println("Enter pwd");
                        String pwd = sc.next();
                        System.out.println("Enter contact");
                        String contact = sc.next();
                        //sql = "INSERT into users (name,email,password,contact) VALUES('me123212','me123@gmail.com','123','123')";
                        sql = "insert into users (name,email,password,contact)  values ('" + name + "','" + email + "','" + pwd + "','" + contact + "')";
                        System.out.println(sql);
                        stmt.execute(sql);
                        System.out.println("value added succesflly ");
                        break;
                    case "show":
                        sql = "select * from users ";
                        rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "  " + rs.getString("name") + "  " + rs.getString("email") + rs.getString("contact"));
                        }
                        break;
                    case "update":
                        int id;

                        System.out.println("Enter Id");
                        id = sc.nextInt();

                        System.out.println("Enter name");
                        name = sc.next();

                        System.out.println("Enter email");
                        email = sc.next();
                        System.out.println("Enter pwd");
                        pwd = sc.next();
                        System.out.println("Enter contact");
                        contact = sc.next();
                        sql = "update users set  name = '" + name + "', email = '" + email + "', password = '" + pwd + "',  contact = '" + contact + "' where id = " + id;
                        System.out.println(sql);
                        stmt.execute(sql);
                        System.out.println("user upated succesfully ");
                        break;
                    
                    case "delete":
                        System.out.println("Enter Id that you want to delete ");
                        id = sc.nextInt();
                        sql = "delete from users where id ="+id;
                        stmt.execute(sql);
                        System.out.println("user delete succesfully ");
                        break;
                        
                    case "exit":
                        exit = req;
                        break;
                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("!an Error accured " + ex.getMessage());

        } finally {
            con.close();
        }

    }

}

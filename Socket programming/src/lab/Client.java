/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket soc;
        BufferedReader dis;
        String sdate;
        PrintStream ps;
        try {
            InetAddress ia = InetAddress.getLocalHost();
            if (args.length == 0) {
                soc = new Socket(InetAddress.getLocalHost(), 5000);
            } else {
                soc = new Socket(InetAddress.getByName(args[0]), 5000);
            }
            dis = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            sdate = dis.readLine();
            System.out.println("the date and time on server is " + sdate);

            ps = new PrintStream(soc.getOutputStream());
            ps.println(ia);
            ps.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

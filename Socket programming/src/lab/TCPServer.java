/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(3000);
        Socket socket = serverSocket.accept();
        System.out.println("connection establishedd ");

        //to sent data to the client 
        PrintStream ps = new PrintStream(
                socket.getOutputStream());

        //to read data from cliet 
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));

        //to read data from keyboard 
        BufferedReader out = new BufferedReader(
                new InputStreamReader(System.in));

        while (true) {
            String s1, s2;
            while ((s1 = in.readLine()) != null) {
                System.out.println(s1);

                s1 = out.readLine();
                //sent to client 
                ps.println(s1);

            }
            //closing connection 
            ps.close();
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
            System.exit(0);

        }

    }
}

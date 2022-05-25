/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class TCPClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 3000);

        //sending data to server 
        DataOutputStream out = new DataOutputStream(
                socket.getOutputStream());

        //readding data from Server 
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));

        //reading data from keyboard
        BufferedReader keyin = new BufferedReader(
                new InputStreamReader(System.in));

        String s1, s2;
        while (!(s1 = keyin.readLine()).equals("exit")) {

            //send to server 
            out.writeBytes(s1 + "\n");

            //receive from server
            s2 = in.readLine();
            System.out.println("message from server ");
            System.out.println(s2);

        }

        //closing connection
        out.close();
        in.close();
        socket.close();
        keyin.close();

    }
}

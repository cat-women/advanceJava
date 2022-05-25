/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Dell
 */
public class TCPEchoClient {

    Socket socket = null;
    DataInputStream input = null;
    DataOutputStream out = null;

    public TCPEchoClient(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("connected");
            System.out.println("taking input from client ");
            input = new DataInputStream(System.in);

            out = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // string to read message from input
        String line = "";
        while (!line.equals("over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);

            } catch (IOException e) {
                System.out.println(e);

            }
        }

        //clsoe connection 
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        TCPEchoClient client = new TCPEchoClient("127.0.0.1", 5000);
    }

}

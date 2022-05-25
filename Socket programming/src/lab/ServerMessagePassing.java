/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.DataInputStream;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class ServerMessagePassing {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            Socket soc =serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(soc.getInputStream());
            System.out.println("this is server ");
            String str = dataInputStream.readUTF();
            System.out.println("client message  " + str);
            soc.close();

        } catch (Exception e) {
            System.out.println("Error  " + e.getMessage());
        }
    }
}

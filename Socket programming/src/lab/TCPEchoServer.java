/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class TCPEchoServer {
    Socket socket = null;
    ServerSocket serverSocket = null;
    DataInputStream input = null;
    
    public TCPEchoServer(int port){
        try{
            serverSocket= new ServerSocket(port);
            System.out.println("server started");
            System.out.println("where is client ");
            socket = serverSocket.accept();
            System.out.println("cleint ayou");
            input = new DataInputStream(
                    new BufferedInputStream(
                            socket.getInputStream()));
            String line  = "";
            
            System.out.println("waiting for client to finish ");
            
            
            while( ! line.equals("over")){
                try{
                    line = input.readUTF();
                    System.out.println(line);
                    
                }catch(IOException e){
                    System.out.println(e);
                }
                
            }
            System.out.println("closing connection ");
            socket.close();
            input.close();
            
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        TCPEchoServer server;
        server = new TCPEchoServer(5000);
        
    }
    
}

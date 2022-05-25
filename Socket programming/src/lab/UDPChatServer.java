/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Dell
 */
public class UDPChatServer {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds = new DatagramSocket(8080);
        byte[] receive = new byte[80000];
        DatagramPacket packetReceive = null;
        
        System.out.println("this is server ");
        while (true) {
            packetReceive = new DatagramPacket(receive, receive.length);
            ds.receive(packetReceive);
            System.out.println("client" + data(receive));
            
            if( data(receive).toString().equals("exit")){
                System.out.println("client is leaving ");
                break;
            }
            receive = new byte[5000];
            
        }

    }

    public static StringBuilder data(byte[] a) {
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (a[i] != 0) {
            sb.append((char) a[i]);
            i++;

        }
        return sb;
    }

}

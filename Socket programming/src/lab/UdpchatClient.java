/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class UdpchatClient {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("this is client ");
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte buff[] = null;

        while (true) {
            String inp = in.nextLine();
            buff = inp.getBytes();
            DatagramPacket packetsend = new DatagramPacket(buff, buff.length, ip, 8080);
            ds.send(packetsend);

            if (inp.equals("exit")) {
                break;
            }

        }

    }

}

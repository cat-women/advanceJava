/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Dell
 */
public class SocketInfo {
    public static void main(String[] args) {
        System.out.println("Getting socket info ");
        for ( String host: args){
            try {
                Socket socket = new Socket(host,80);
                System.out.println("connected to   "+ socket.getInetAddress()+
                        "on  port "+socket.getPort()+
                        "from port "+socket.getLocalAddress());
            } catch (UnknownHostException e) {
                System.out.println("Error "+e.getMessage());
            }catch( SocketException e){
                System.out.println(e);
            }catch( IOException e){
                System.out.println("io "+e.getMessage());
            }
        }
    }
}

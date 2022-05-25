/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
//
import java.io.BufferedReader;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URISyntaxException;

import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket cs;
        PrintStream ps;
        BufferedReader dis;
        String inet;
        try {
            ss = new ServerSocket(5000);
            System.out.println("ctl c to quit");
            while (true) {
                cs = ss.accept();
                ps = new PrintStream(cs.getOutputStream());
                Date d = new Date();
                ps.println(d);
                dis = new BufferedReader(new InputStreamReader(cs.getInputStream()));
                inet = dis.readLine();
                System.out.println("client ip address is :" + inet);
                ps.close();
                dis.close();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

//public class Server{
//    public static void main(String[] args) {
//        SocketAddress addr = new InetSocketAddress("webcache.example.com", 8080);
//        Proxy proxy = new Proxy(Proxy.Type.HTTP,addr);
//        try{
//                URL url = new URL("https://www.facebook.com/");
//                URLConnection  con = url.openConnection(proxy);
//                
//    }catch(Exception e){
//            System.out.println(e);
//            System.out.println("False");
//    }
//        System.out.println("Proxy type "+proxy.type());
//        System.out.println("proxy Address"+proxy.address());
//        System.out.println("proxy hascode "+proxy.hashCode());
//        System.out.println("proxy string "+proxy.toString());
//                

//    }}

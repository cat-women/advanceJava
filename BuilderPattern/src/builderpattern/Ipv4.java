/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Ipv4 {  

    public static void main(String[] args) throws UnknownHostException {
        
        
        
        String url = "www.facebook.com";

        Inet4Address ip = (Inet4Address) Inet4Address.getByName(url);
        Inet4Address ip2 = (Inet4Address) InetAddress.getByName("www.yahoo.com");

        System.out.println("Address : " + Arrays.toString(ip.getAddress()));

        //return host address -> facebook 
        System.out.println("Host Address : " + ip.getHostAddress());

        //return true if ip is a multicast address -> facebook 
        System.out.println("isMulticastAddress : " + ip.isMulticastAddress());

        //return hash of the ip -> facebook
        System.out.println("hashCode : " + ip.hashCode());

        //check if ip of facebook is equal to ip of yahoo
        System.out.println("ip==ip2 : " + ip.equals(ip2));

    }
}

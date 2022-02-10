/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.net.*;



/**
 *
 * @author Dell
 */
public class JavaApplication1 {

    public static void main(String[] args) {

        
        try{
            URL  url = new URL("https://www.tutorialspoint.com:3000/tutorialslibrary.htm?hehe");
            System.out.println("protocol:"+url.getProtocol());
            System.out.println("Host name:"+url.getHost());
            System.out.println("port no:"+url.getPort());
            System.out.println("file name :"+url.getFile());
            System.out.println("query:"+url.getQuery());
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}

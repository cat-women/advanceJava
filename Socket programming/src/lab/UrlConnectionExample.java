/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Dell
 */
public class UrlConnectionExample {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.facebook.com/");
        URLConnection   con = url.openConnection();
        InputStream input  = con.getInputStream();
        int i;
        while( (i = input.read()) != -1){
            System.out.println((char)i);
            
        }
        }catch( Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

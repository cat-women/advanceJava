/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class Httpheader {

    public static void main(String[] args) {
        try {
            //URL url = new URL("https://www.facebook.com/");
            URL url = new URL("https://www.google.com/");

            URLConnection con = url.openConnection();
            for (int i = 0;; i++) {
                String name = con.getHeaderFieldKey(i);
                String value = con.getHeaderField(i);
                if (name == null && value == null) {
                    break;
                }
                if (name == null) {
                    System.out.println("server http version, reasponse code:");
                    System.out.println(value + "\n");

                } else {
                    System.out.println(name + "=" + value);

                }
            }

        } catch (Exception e) {
            System.out.println("Errpr !" + e.getMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.net.Socket;
import java.io.DataOutputStream;

/**
 *
 * @author Dell
 */
public class ClientMessagePassing {

    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost",6000);
            DataOutputStream dataOutputStream = new DataOutputStream(soc.getOutputStream());
            System.out.println("this is client ");
            dataOutputStream.writeUTF("hello server");
            dataOutputStream.flush();
            dataOutputStream.close();
            soc.close();

        } catch (Exception e) {
            System.out.println("Error 1" + e.getMessage());
        }

    }

}

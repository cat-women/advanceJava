/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class FileStream {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        StringBuffer buffer = new StringBuffer();

        try {
            fileOutputStream = new FileOutputStream("D:/NetworkProgramming/lab/utf.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF("Im testing how utfWrite works ");
            dataOutputStream.flush();
            System.out.println("data inserted into file ");

            //reading file 
            fileInputStream = new FileInputStream("D:/NetworkProgramming/lab/utf.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            while (dataInputStream.available() > 0) {
                buffer.append(dataInputStream.readUTF());
            }

        } catch (EOFException e) {
            System.out.println("eof " + e.toString());
        } catch (IOException e) {
            System.out.println("eof " + e.toString());

        }
        System.out.println("content in file are "+buffer.toString());
        
    }
}

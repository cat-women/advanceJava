/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import com.sun.org.apache.xerces.internal.util.URI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Dell
 */
class HelperClass {

    public HelperClass(String webpages) {
        try {
            URL url = new URL(webpages);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));
            // where to store the webpage 
            BufferedWriter writter = new BufferedWriter(new FileWriter("D://NetworkProgramming/Download.html"));

            //read each line from stream 
            String line;
            while ((line = reader.readLine()) != null) {
                writter.write(line);

            }
            reader.close();
            writter.close();
            System.out.println("Successfully downloaded");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class DownloadPage {

    public static void main(String[] args) throws IOException {
        String url = "https://www.geeksforgeeks.org/download-web-page-using-java/";
        HelperClass obj = new HelperClass(url);
    }

}

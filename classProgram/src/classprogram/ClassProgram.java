/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classprogram;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ClassProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[4];
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter size of array ");
            int size = in.nextInt();
            if (size >= names.length) {
                throw new ArrayOutOfRange("Array size is smaller than given size");
            } else {
                System.out.println("Enter names");

                for (int i = 0; i < names.length; i++) {
                    names[i] = in.nextLine();
                }

                System.out.println("Names are :");
                
                for (String name : names) {
                    System.out.println(name);
                }
            }
        } catch (Exception e) {
            System.out.println("Ann error has occured " + e);
        }
    }

    private static class ArrayOutOfRange extends Exception {

        public ArrayOutOfRange(String str) {
            System.out.println(str);
        }
    }
}

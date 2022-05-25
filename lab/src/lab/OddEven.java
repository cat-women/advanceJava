/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class OddEven {
    int n1;
    boolean oddEven;
    void getName(){
        System.out.println("Enter Number ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
    }
    void oddEven(){
        if(n1 % 2 == 0)
        {
            System.out.println("Number is even ");
            }
        else
            System.out.println("Number is odd ");
        
       
    }
}

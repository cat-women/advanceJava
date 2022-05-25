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
class AddInputNumber {
    int n1,n2;
    
    void setName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        n1 = in.nextInt();
        n2 = in.nextInt();
    }
    void printSum(){
        System.out.println("sum of two numbers is "+(n1+n2));
    }
}

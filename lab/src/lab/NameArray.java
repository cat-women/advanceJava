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
class NameArray {
    
    String[] name=new String[5];
    
    void setName(){
        System.out.println("Enter five names ");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            name[i] = in.nextLine();
        }
    }
    void getName(){
        System.out.println("Names are :t");
        for(int i=0; i<5; i++){
            System.out.println(name[i]);
        }
    }
}



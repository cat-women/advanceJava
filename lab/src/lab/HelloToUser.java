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
class HelloToUser {
    String name;
    
    void setName(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = input.nextLine();
        
    }
    void getName(){
        System.out.println("Hello "+name);
    }
}

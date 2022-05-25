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
public class OddArray {

    int[] num = new int[3];
    int sum = 0;

    void getName() {
        System.out.println("Enter three numbers ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            num[i] = in.nextInt();
        }

    }

    void isOdd() {
        System.out.println("The odd numbers are :");
        for (int i = 0; i < 3; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }
    }
}

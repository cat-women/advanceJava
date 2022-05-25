/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * w ;
 *
 * @author Dell
 */
public class SumOfDigit {

    int[] num = new int[3];
    int sum = 0;

    void getName() {
        System.out.println("Enter three numbers ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            num[i] = in.nextInt();
        }

    }

    void sum() {
        for (int i = 0; i < 3; i++) {
            sum += num[i];
        }
        System.out.println("Sum of numbers is" + sum);
    }
}

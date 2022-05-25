/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Dell
 */
class AddTwoNumber {
    int n1,n2;
    
    AddTwoNumber(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    void addTwo(){
        System.out.println("sum of two number"+n1+"and "+n2+" is "+(n1+n2));
    }
}

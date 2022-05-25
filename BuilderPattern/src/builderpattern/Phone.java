/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Dell
 */
public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double secreeenSize;
    private int battery;
    private String color;


    public Phone(String os, int ram, String processor, double secreeenSize, int battery,String color) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.secreeenSize = secreeenSize;
        this.battery = battery;
        this.color = color;
        
    }
    
    public String getDetails(){
        return "Phone: os:"+os+"ram:"+ram+"color:"+color+"processor:"+processor+"screen size"+secreeenSize+"battery:"+battery;
    }
    
    
}

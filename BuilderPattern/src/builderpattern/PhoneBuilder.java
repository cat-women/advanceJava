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
public class PhoneBuilder{

    private String os;
    private int ram;
    private String processor;
    private double secreeenSize;
    private int battery;
    private String color;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setSecreeenSize(double secreeenSize) {
        this.secreeenSize = secreeenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
        
    }

    public Phone getPhone() {
        return new Phone(os, ram, processor, secreeenSize, battery, color);
    }

}

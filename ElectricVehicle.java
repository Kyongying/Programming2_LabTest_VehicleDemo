/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soc_298738;


public class ElectricVehicle extends Vehicle implements Driveable,Chargeable{

    public ElectricVehicle(String make, String model, int year,int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }
    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
public void startVehicle(){
    System.out.println("YongYing's Electric Vehicle started");
}

public void drive(){
    System.out.println("YongYing's Electric Vehicle is driving");
}

    @Override
    public void chargeVehicle() {
        System.out.println("Vehicle change");
    }
    
    
}

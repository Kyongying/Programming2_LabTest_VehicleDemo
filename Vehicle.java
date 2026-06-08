/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soc_298738;

/**
 *
 * @author kyong
 */
public abstract class Vehicle {

    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
    public void startVehicle(){
        
    }
    
    public void stopVehicle(){
        
    }
   
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle myCar01 = new Car("Toyota","Corolla",2022,4);
        Vehicle myEV01 = new ElectricVehicle("Tesla","Model S",2023,100);
        Vehicle myCar02 = new Car("Proton","Saga",2020,4);
        Vehicle myEV02 = new ElectricVehicle("BYD","Dolphin",2023,100);
        Vehicle myCar03 = new Car("Proton","S70",2024,4);
        Vehicle myEV03 = new ElectricVehicle("Proton","E-Mas",2023,100);
        
        Vehicle car [] = new Vehicle[6];
        car[0] = myCar01;
        car[1] = myEV01;
        car[2] = myCar02;
        car[3] = myEV02;
        car[4] = myCar03;
        car[5] = myEV03;
        
        for (Vehicle vehicle : car){
            vehicle.startVehicle();
            if (!(vehicle instanceof soc_298738.Driveable)){
            } else {
                ((Driveable)vehicle).drive();
            }
        }
        
        
    }
    
}

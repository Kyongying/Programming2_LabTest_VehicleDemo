package soc_298738;

/**
 *
 * @author kyong
 */
public class Car extends Vehicle {

    
    public Car(String make, String model, int year,int doorCount) {
        super(make, model, year);
        this.doorCount = doorCount;
    }
    private int doorCount;

    public int getDoorCount() {
        return doorCount;
    }
    
 public void startVehicle(){
    System.out.println("YongYing's Car Started");
}
}

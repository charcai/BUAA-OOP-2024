public class Car extends Vehicle {
    private Person[] passenger;
    public Car(String plate){
        super(4, plate);
    }
    public void setDriver(Person driver1) {
        driver = driver1;
    }
    public void setPassenger(Person[] passenger1) {
        passenger = passenger1;
    }
}

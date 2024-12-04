public class Tank extends Vehicle {
    private Person[] passenger;
    public Tank(String plate){
        super(0, plate);
    }
    public void setDriver(Person driver1) {
        driver = driver1;
    }
    public void setPassenger(Person[] passenger1) {
        passenger = passenger1;
    }
}

import java.sql.Driver;

public class Motorbike extends Vehicle {
    Person driver, passenger;
    public Motorbike() {
        super();
    }
    public Motorbike(String license) {
        super(2, license);
    }
    public void setDriver(Person driver) {
        this.driver = driver;
    }
    public void setPassenger(Person passenger) {
        this.passenger = passenger;
    }
}

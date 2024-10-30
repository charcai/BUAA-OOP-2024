import java.awt.*;

abstract public class Vehicle {
    protected int wheels;
    protected String licensePlateNumber;
    protected Engine engine;
    protected Wheel wheel;
    protected Person driver;
    public Vehicle() {
        this(0, "");
    }
    public Vehicle(int wheels, String licensePlateNumber) {
        setter(wheels, licensePlateNumber);
    }
    public void setter(int wheels, String licensePlateNumber) {
        if(wheels < 0) {
            this.wheels = 0;
            throw new IllegalArgumentException("Invalid wheels!");
        }
        else {
            this.wheels = wheels;
            this.licensePlateNumber = licensePlateNumber;
        }
    }
    public void setter(Engine engine) {
        this.engine = engine;
    }
    public void setter(Wheel wheel) {
        this.wheel = wheel;
    }
    public void print(String name) {
        System.out.println(name + "有 " + wheels + " 个车轮");
        System.out.println(name + "的轮胎为 " + wheel.getYear() + " 年生产的 " + wheel.getBrand());
        System.out.println(name + "车牌为 " + licensePlateNumber);
        System.out.println(name + "的引擎为 " + engine.getYear() + " 年生产的 " + engine.getBrand());
        System.out.print("\n");
    }
}

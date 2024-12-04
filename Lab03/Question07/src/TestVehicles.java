public class TestVehicles {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("京A1BUAA");
        motorbike.setter(new Engine("嘉陵", 2000));
        motorbike.setter(new Wheel("Michelin", 2020));
        motorbike.print("摩托车");

        Car car = new Car("京AG6001");
        car.setter(new Engine("Volkswagen", 2018));
        car.setter(new Wheel("Bridgestone", 2022));
        car.print("小轿车");

        Tank tank = new Tank("VA00001");
        tank.setter(new Engine("99A", 2019));
        tank.setter(new Wheel("履带", 2021));
        tank.print("坦克");
    }
}

public class TestMotorbike {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("京A1BUAA");
        Person brother = new Person("Jeff", 24);
        Person sister = new Person("Sierra", 20);
        motorbike.setDriver(brother);
        motorbike.setPassenger(sister);
        motorbike.setter(new Engine("嘉陵", 2000));
        motorbike.setter(new Wheel("Michelin", 2020));
        motorbike.print("摩托车");
        System.out.println("摩托车驾驶员为 " + motorbike.driver.age + " 岁的 " + motorbike.driver.name);
        System.out.println("摩托车乘客为 " + motorbike.passenger.age + " 岁的 " + motorbike.passenger.name);
        sister.say("不像我，我只会心疼 giegie~");
    }
}

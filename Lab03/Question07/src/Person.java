public class Person {
    String name;
    int age;
    public Person() {
        this("", 0);
    }
    public Person(String name, int age) {
        if(age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        this.name = name;
        this.age = age;
    }
    public void say(String message) {
        System.out.println(message);
    }
}

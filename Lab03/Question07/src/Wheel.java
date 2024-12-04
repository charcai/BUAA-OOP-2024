public class Wheel {
    private String brand;
    private int year;
    public Wheel() {
        this("", 0);
    }
    public Wheel(String brand, int yy) {
        this.brand = brand;
        this.year = yy;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
}

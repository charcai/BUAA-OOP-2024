public class Engine {
    private String name;
    private int inventionYear;
    public Engine() {
        this("", 1900);
    }
    public Engine(String namee, int Year) {
        name = namee;
        inventionYear = Year;
    }
    public String getBrand() {
        return name;
    }
    public int getYear() {
        return inventionYear;
    }
}

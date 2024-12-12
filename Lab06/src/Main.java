import java.io.IOException;

public class Main {
    public static void start() throws IOException, RuntimeException {
        throw new RuntimeException("Unable to Start");
    }

    public static void main(String[] args) {
        try {
            start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
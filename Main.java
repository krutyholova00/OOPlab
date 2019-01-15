import java.util.ArrayList;
import java.util.List;

public class Main {

    public enum Color {
        RED,
        GREEN,
        BLUE,
        PINK
    }

    public enum Size {
        SMALL,
        MIDDLE,
        BIG
    }


    public static void main(String[] args) {
        List<Plants> plants = new ArrayList<Plants>();

        plants.add(new Flowers_spot(Color.BLUE.name(), "Money tree", 20.2, Size.SMALL.name(), true));
        plants.add(new Cactus(100,"Desert", false));
        plants.add(new Flowers(Color.RED.name(), 25, true));

        for (Plants plant: plants) {
            System.out.println(plant.getProperties());
        }
    }
}

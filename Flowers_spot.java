public class Flowers_spot extends Plants {

    String size;
    boolean hasStand;

    Flowers_spot() {
        size = Main.Size.MIDDLE.name();
        hasStand = true;
    }

    Flowers_spot(String color, String name, double price, String s, boolean st){
        this.color = color;
        this.name = name;
        this.price = price;
        size = s;
        hasStand = st;
    }

    @Override
    public String getProperties() {
        return "CLASS: Flowers_spot - " + super.getProperties() + String.format("Size:%s; Has stand:%b", size, hasStand);
    }
}
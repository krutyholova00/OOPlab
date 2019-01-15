public class Flowers extends Plants {

    boolean hasThorns;

    Flowers() {
        hasThorns = true;
        name = "Flowers";
    }

    Flowers(String color, double price, boolean t){
        this.color = color;
        this.price = price;
        hasThorns = t;
        name = "Flowers";
    }

    @Override
    public String getProperties() {
        return "CLASS: Flowers - " + super.getProperties() + String.format("Has Thorns:%b", hasThorns);
    }
}

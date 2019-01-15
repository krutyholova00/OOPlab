public class Cactus extends Plants {

    String sort = "NULL";
    boolean isToxic;

    Cactus(){
        isToxic = false;
        color = Main.Color.GREEN.name();
        name = "Cactus";
    }

    Cactus(double price, String s, boolean t){
        this.price = price;
        sort = s;
        isToxic = t;
        color = Main.Color.GREEN.name();
        name = "Cactus";
    }

    @Override
    public String getProperties() {
        return "CLASS: Cactus - " + super.getProperties() + String.format("Sort:%s; Toxic:%b", sort, isToxic);
    }
}
public class Plants implements Properties{


    String color;
    String name;
    double price;

    Plants() {}

    Plants(String c, String n, double p){
        color = c;
        name = n;
        price = p;
    }

    @Override
    public String getProperties() {
        return String.format("Name:%s; Color:%s; Price:%.2f; ",name, color, price);
    }
}

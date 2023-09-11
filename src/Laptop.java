public abstract class Laptop implements Printable {
    private String name;
   private int price;
    private double display;

    public Laptop(String name, int price, double display) {
        this.name = name;
        this.price = price;
        this.display = display;
    }

    public int getPrice() {
        return price;
    }

    public double getDisplay() {
        return display;
    }

    public String getName() {
        return name;
    }


}


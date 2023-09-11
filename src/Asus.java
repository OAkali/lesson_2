public class Asus extends Laptop {
    private int GB;

    public Asus(String name, int price, double display, int GB) {
        super(name, price, display);
        this.GB = GB;
    }

    public int getGB() {
        return GB;
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()+
                "\nPrice: "+getPrice()+
                "\nDisplay: "+getDisplay()+
                "\nGB: "+GB+
                "\n");

    }
}

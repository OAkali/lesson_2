public class Macbook extends Laptop{
    private int guarantee;


    public Macbook(String name, int price, double display, int guarantee) {
        super(name, price, display);
        this.guarantee = guarantee;
    }

    public int getGuarantee() {
        return guarantee;
    }

    @Override
    public void print(){
        System.out.println("Name: "+getName()+
                "\nPrice: "+getPrice()+
                "\nDisplay: "+getDisplay()+
                "\nGuarantee: "+guarantee+
                "\n");

    }
}

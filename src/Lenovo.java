public class Lenovo extends Laptop{
    private String countryOfOrigin;

    public Lenovo(String name, int price, double display, String countryOfOrigin) {
        super(name, price, display);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()+
                "\nPrice: "+getPrice()+
                "\nDisplay: "+getDisplay()+
                "\nCountry of origin: "+countryOfOrigin+
                "\n");
    }
}

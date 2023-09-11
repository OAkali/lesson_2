public class Main {
    public static void main(String[] args) {
        createObject("Lenovo").print();
        createObject("Macbook").print();
        createObject("Asus").print();


    }

    public static Laptop createObject(String className) {
        Printable printable = null;

        switch (className) {
            case "Lenovo":
                Lenovo lenovo= new Lenovo("Legion 5",200,15.6,"China");
                return lenovo;
            case "Macbook":
                Macbook macbook=new Macbook("Macbook 5",210,16.6,12);
                return macbook;
            case "Asus":
                Asus asus= new Asus("TUF Game A15",230,17.4,60);
                return asus;

        }
        return (Laptop) printable;


    }

}
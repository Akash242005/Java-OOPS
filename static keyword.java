class Mobile {
    String brand;
    double price;
    static String name;
    public void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Price : "+price);
        System.out.println("Name : "+name);
    }
    public static void show(Mobile obj){
        System.out.println("Brand : "+obj.brand);
        System.out.println("Price : "+obj.price);
        System.out.println("Name : "+name);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 125000;
        Mobile.name = "Phone";
        m1.display();
        Mobile m2 = new Mobile();
        m2.brand = "Vivo";
        m2.price = 10000;
        Mobile.show(m2);
    }
}

abstract class vehical{
    abstract void start();
    abstract void breaka();
    void stop(){
        System.out.println("The Vehical stated moving");
    }
}
class car extends vehical{
    void start(){
        System.out.println("The car started moving");
    }
    void breaka(){
        System.out.println("The break is pressed");
    }
}





public class Main{
    public static void main(String[] args)
    {
        vehical c = new car();
        c.start();
        c.stop();
        c.breaka();
    }
}

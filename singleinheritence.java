class Animals {
    void eat(){
        System.out.println("The animal is eating now");
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("The dog is barking");
    }
}
public class singleinheritence{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}

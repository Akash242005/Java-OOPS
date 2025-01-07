import java.util.*;

public class Main{
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(432);
        set.add(398);
        set.add(82);
        set.add(18);
        set.add(328);
        System.out.println("The set is : "+set);
        System.out.println("The first element is : "+set.first());
        System.out.println("The element in the last is : "+set.last());
        SortedSet<Integer> head=set.headSet(15);
        System.out.println("headset (less than 15): "+head);
        SortedSet<Integer> tail=set.tailSet(15);
        System.out.println("Taile Set (Element greater than or equal 15) : "+tail);
        SortedSet<Integer> subset=set.subSet(10,30);
        System.out.println("SubSet (10 to 30): "+subset);
    }
}

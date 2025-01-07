import java.util.*;

public class Main{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(49859);
        set.add(3);
        set.add(3);
        System.out.println("The first set is : "+set);
        Set<Integer> set1 = new HashSet<>();
        set1.add(332);
        set1.add(943);
        System.out.println("The second set is : "+set1);
        set.addAll(set1);
        System.out.println("The adding of two set : "+set);
        Iterator iterator = set.iterator();
        System.out.print("Using iterator : ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println(" ");
        set.remove(3);
        System.out.println("The set after removing the element : "+set);
        set.removeAll(set1);
        System.out.println("The element after using removeAll : "+set);
        set.add(332);
        set.retainAll(set1);
        System.out.println("The set after using retainAll : "+set);
        set.clear();
        System.out.println("The set after clearing : "+set);
        set.add(3298);
        set.add(202);
        set.add(54);
        System.out.println("The size of the set is : "+set.size());
        Object[] array = set.toArray();
        System.out.print("The array from set : ");
        for(Object obj:array)
        {
            System.out.print(obj+" ");
        }
        System.out.println(" ");
        System.out.println("If it contains 54 : "+set.contains(54));
        System.out.println("Using ContainsAll : "+set.containsAll(set1));
    }
}

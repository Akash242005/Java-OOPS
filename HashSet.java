import java.util.*;

public class Main{
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        // Capacity : 16
        // Load Factor : 0.75 
        for(int i=0;i<=6;i++)
        {
            hash.add(i);
            System.out.println("The element added is "+i+" and the hash set is : "+hash);
        }
        hash.add(7);
        System.out.println("The element added is 7 and the hash set is : "+hash);
        HashSet<String> hash2 = new HashSet<>();
        hash2.add("a");
        hash2.add("b");
        hash2.add("c");
        System.out.println("Is the set is empty : "+hash.isEmpty());
        HashSet<String> hash1 = (HashSet<String>)hash2.clone();
        System.out.println("After cloning : "+hash1);
    }
}

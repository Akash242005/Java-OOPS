import java.util.*;

public class Main{
    public static void main(String[] args) {
        LinkedHashSet<String> hash = new LinkedHashSet<>();
        hash.add("bus");
        hash.add("car");
        hash.add("bike");
        System.out.println("The set is : "+hash);
        System.out.println("The size is : "+hash.size());
        hash.remove("bike");
        System.out.println("The set is : "+hash);
        hash.addAll(Arrays.asList("scooter","helicopter"));
        System.out.println("The list after adding ujusing addAll method : "+hash);
        List<String> set = new ArrayList<>();
        set.add("apple");
        set.add("orange");
        set.add("pinapple");
        set.add("pinapple");
        LinkedHashSet<String> hash1 = new LinkedHashSet<>(set);
        System.out.println("The array list that is going to be converted into set : "+set);
        System.out.println("The array list converted to the list : "+hash1);
        Object[] array = hash.toArray();
        System.out.print("The set is converted into the array : ");
        for(Object obj:array)
        {
            System.out.print(obj+" ");
        }
        System.out.println();
        System.out.println("The hash1 is present in the hash1 or not : "+hash.contains(hash1));
    }
}

import java.util.*;

public class Main{
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(39);
        tree.add(87);
        tree.add(10);
        tree.add(90);
        tree.add(4);
        tree.add(109);
        tree.add(130);
        tree.add(190);
        System.out.println("The TreeSet is : "+tree);
        System.out.println("The first element : "+tree.first());
        System.out.println("The last element is : "+tree.last());
        System.out.println("The ceiling of 16 : "+tree.ceiling(16));
        System.out.println("The floor of 16 : "+tree.floor(16));
        System.out.println("The highest of the 16 : "+tree.higher(16));
        System.out.println("The lower of the 16 : "+tree.lower(16));
        System.out.println("The headSet of 16 is : "+tree.headSet(16));
        System.out.println("The tailSet of 16 : "+tree.tailSet(16));
        System.out.println("The subSet of the set is : "+tree.subSet(10, 50));
        System.out.println("Contains 40 : "+tree.contains(40));
        System.out.println("The PollFirst method : "+tree.pollFirst());
        System.out.println("The set after using the PollFirst : "+tree);
        System.out.println("The PollLast method : "+tree.pollLast());
        System.out.println("The set after using the PollLast : "+tree);
        Iterator<Integer> iterator = tree.iterator();
        System.out.print("The iterator in the tree : ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        Object[] array = tree.toArray();
        System.out.print("The elements in the tree using array : ");
        for(Object obj:array)
        {
            System.out.print(obj+" ");
        }
        System.out.println();
        tree.addAll(Arrays.asList(1,3,2));
        System.out.println("The elements after adding using addAll : "+tree);
    }
}

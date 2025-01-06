import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(7);
        array.add(14);
        array.add(24);
        array.add(34);
        System.out.println("Initial List : "+array);
        array.add(2, 73);
        System.out.println("Array after adding an element at index 3 : "+array);
        List<Integer> number = List.of(29,2993,19,3,2,91);
        // List<Integer> number = new ArrayList<>();
        // number.add(21);
        // number.add(71);
        //number.add(317);
        array.addAll(number);
        System.out.println("After adding the number list : "+array);
        System.out.println("To get the element at the specific index : "+array.get(4));
        array.set(5, 92);
        System.out.println("After replacing the element at index 5 : "+array);
        array.remove(4);
        System.out.println("Array after removing the element at the index 4 : "+array);
        array.add(19);
        System.out.println("Before removing the number 19 from list : "+array);
        array.remove(Integer.valueOf(19));
        System.out.println("After removing the number 19 using Integer.valueOf(19) : "+array);
        System.out.println("List Contains 19 : "+array.contains(19));
        System.out.println("Is the list is empty : "+array.isEmpty());
        System.out.println("The size of the list is : "+array.size());
        // array.clear();
        // System.out.println("Is the list is empty : "+array.isEmpty());
        array.add(7);
        System.out.println("The Last index of the number 7 is : "+array.lastIndexOf(7));
        System.out.println("The First index of the number 7 is : "+array.indexOf(7));
        Collections.sort(array);
        System.out.println("The list after sorting : "+array);
        array.sort(Comparator.reverseOrder());
        System.out.println("The list after sorting : "+array);
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println(" ");
        Object[] arr = array.toArray();
        for(Object obj : arr)
        {
            System.out.print(obj+" ");
        }
        array.clear();
        System.out.println("Is the list is empty : "+array.isEmpty());
    }
}

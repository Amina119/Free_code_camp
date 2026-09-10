import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;   

public class Assignment11 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Amina");
        names.add("Alida");
        names.add("Siana");
        names.add("Andy");
        names.add("Selia");
        names.add("Helia");
        names.add("Gaby");
        names.add("Lea");
        names.add("Brown");

        names.addFirst("Sarah");
        names.addLast("James");

        // 1. Append a specific element in a linked list
        names.add("Michael");

        // Print the full lists
        System.out.println(names);

        // Print element at index 1
        System.out.println("elemnt at index"+names.get(1));
        
        // 2. iterates al through

        for (String element : names) {
            System.out.println("iteration:"+element);

    }
    // 3.iterarte from specific position
        int startIndex = 3; // Starting from index 3
        for (int i = startIndex; i < names.size(); i++) {
            System.out.println("iteration from index"+startIndex+":"+names.get(i));
        }
    // 4. Iterate in reverse order
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println("iteration in reverse order:"+names.get(i));
        }    
    // 5.Add element at specific position
        names.add(2, "David"); 
        System.out.println("After adding David at index 2:"+names);   
    //6. insert element at the beginning and end of the linked list
        names.addFirst("Emily"); 
        names.addLast("Sophia"); 
        System.out.println("last and fisrt elements are"+names);
    //7. add elemennt at the front of a linklist
        names.offerFirst("Olivia"); 
        System.out.println("front:"+names);
    //8. add element at the end of a linked list
        names.offerLast("Liam"); 
        System.out.println("ame at the end:"+names);
    //9.insert element at specific position
        names.add(4, "Ethan");
        names.add(5,"joel");
        names.add(3,"fatima");
        
        System.out.println("After adding Ethan at index 4:"+names);
    //10.get first and last occurence
        String firstElement = names.getFirst();
        String lastElement = names.getLast();
        System.out.println("first element:"+firstElement);
        System.out.println("last element:"+lastElement);

    //11.display elements and their positions
    for(int a =0;a<names.size();a++){
        System.out.println("Element at index"+a+":"+names.get(a));
    }
    //12. remove first and last element
    names.remove(2);
    System.out.println("the new list is:" + names);
    //13.remove first and last element
    names.removeFirst();
    names.removeLast();
    System.out.println("after removing first and last element:"+names);
    //14.remove all elements
   // names.removeAll(names);
    System.out.println(names);
    //15.swaps 2 elements  
    
    Collections.swap(names, 1, 4);
    System.out.println("After swapping:"+names);
    //16.shuffle the elements  
    Collections.shuffle(names);
    System.out.println("After shuffling:"+names);

    //17.join 2 linked lists
    LinkedList<String> names1= new LinkedList<>();
    names1.add("ebogo");
    names1.add("kiana");  
    names.addAll(names1);
    System.out.println(names);

    //18.copy a likedlist into another 
    LinkedList<String>copiednames= new LinkedList<>();
    //19copiednames.addAll(names);
    //System.out.println(copiednames);

    //20remove and return first elements
     String removed= names.removeFirst();
    System.out.println("removed element is: "+removed);

    //21.retrieve but not remove first element in an array
    String first_element = names.get(0);
    System.out.println("the first element is "+ first_element);
    //OR 
    String first_element1 = names.peekFirst();
    System.out.println("peek elemnt is :" + first_element1);

    //22.checks if a number exists 
     String target = "Andy";
     boolean exists = names.contains("Andy");
     System.out.println("does the list contain it?"+exists);

     //23. converts a linled list to an arraylist
     ArrayList<String> array = new ArrayList<>(names);
     System.out.println(names);

    // 24 compare2 linkedlists
    LinkedList<String> names2 = new LinkedList<>();
    names2.add("Ramla");
    names2.add("Inna");
    names2.add("Alicia");

    //LinkedList<String>names3 = new LinkedList<String>();
    //for ( String x :names);
    //names3.add(names.contains(x)? "yes":"no");

    System.out.println(names = names2);
    //25.check if linkedlist is empty or not
    System.out.println("is the list empty?"+ names.isEmpty());
    //26. replace an empty linked list
    names.set(1,"jason");
    names.set(2,"Alonzo");
    System.out.println(names);









}


}

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class Assignment12 {
    public static void main(String[] args) {
        ArrayList<String>colors = new ArrayList<>();
    //1.add elements and traverse
        colors.add("Brown");
        colors.add("yellow");
        colors.add("orange");
        colors.add("purble");
        
        
        //2.traverse the array
        for(String elements:colors);
        System.out.println(colors);
        //3.add element at first and last position 
        colors.addFirst("grey");

        System.out.println(colors);

        //4.retrieve element by array position
        
        System.out.println(colors.get(0));

        //5.update 
        colors.set(3,"green");
        System.out.println(colors);

        //6.remove thrid elements
            colors.remove(2);
        System.out.println(colors);

        //7.search for an element
        if(colors.contains("orange")){
            System.out.println("the array contains the element");
            }
        else{
                System.out.println("the array does not contain the element");
        }
        //8.sort 
        Collections.sort(colors);
        System.out.println(colors);
    
        //9.copy array list
        ArrayList<String>colors1= new ArrayList();
        colors.addAll(colors1);
         System.out.println(colors);

        //10.shuffle 
        Collections.shuffle(colors);
        System.out.println(colors);

        //11.Reverse 
        Collections.reverse(colors);
        System.out.println(colors);

        //12.extract sublist
        //colors<String>sub_list = colors.sublist(0,5);
        //13.compare 2 arrays 
        ArrayList<String>colors3 = new ArrayList<>();
        System.out.println(colors = colors3);

        //14.swap 
        //Collections.swap(colors, 1, 4);
        //System.out.println("After swapping:"+colors);

        //15.join array lists 
        ArrayList<String> colors4= new ArrayList<>();
        colors4.add("ebogo");
        colors4.add("kiana");  
        ArrayList<String> colors5= new ArrayList<>();
        colors4.add("eboo");
        colors4.add("kina");  
        colors5.addAll(colors4);
        System.out.println(colors4); 

        //16.Clone 
        ArrayList<String>colors6 = (ArrayList<String>) colors.clone();
        System.out.println(colors6);
         
        //17.empty
        colors.clear();
        System.out.println(colors);

        //18.check if empty
        System.out.println("is the list empty?"+ colors3.isEmpty());

        //19.capacity
        int  size = colors.size();
        System.out.println(size);

        //20.increase size 
        colors6.ensureCapacity(6);
        colors.add("hello");
        colors.add("hi");
        System.out.println(colors6);

        //21.replace element 
        ArrayList<String>colors7 = new ArrayList<>();
        colors7.add("orange");
        System.out.println(colors7);
        colors7.set(0, "purple");
        System.out.println(colors7);

        //22.print element by position
        for (int index = 0; index < colors.size(); index++) {
            System.out.println(index);
        }
         

        





    

        
    }
    
}

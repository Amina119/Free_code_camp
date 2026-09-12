import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class java2 {
    public static void main(String[] args){
        ArrayList<String>student = new ArrayList<String>();
        student.add("Amina");
        student.add("Alida");
        student.add("Gaetan");
        student.add("Amira");
        student.add("precious");
        student.add("Asta");
        student.add("Anna");
        student.add("Amina");
        student.add("Nadia");
        student.add("Alicia");

        System.out.println(student);

        System.out.println(student.size());
        System.out.println(student.get(1));
        System.out.println(student.set(1,"Anna"));
        System.out.println(student.get(1));

        for(int i=0 ;i<10 ;i++){
            
            System.out.println(student.get(i));
            

        }
        System.out.println(student.get(1));
        Collections.sort(student);
         System.out.println(student );

    
        
    }
}

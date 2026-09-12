import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class java3 {

public static void  main( String [] args ){
     ArrayList<Integer>student = new ArrayList<Integer>();
        student.add(10);
        student.add(2);
        student.add(6);
        student.add(3);
        student.add(8);
        student.add(4);
        student.add(7);
        student.add(5);
        student.add(9);
        student.add(1);


         System.out.println(student);


         Collections.sort(student);
         System.out.println(student );
}
}
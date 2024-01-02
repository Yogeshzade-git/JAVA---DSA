import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IterableJavaCollection {
    public static void main(String[] args) {
        
        List<Integer> arrl = new ArrayList<Integer>();  // list = Interface       // ArrayList = Class

        arrl.add(23);
        arrl.add(6);
        arrl.add(34);
        arrl.add(123);
        arrl.add(87);

        //we have method called as a iterator() which iterates all elements
        Iterator<Integer> itr = arrl.iterator();
        while(itr.hasNext()){    //next() method only returns one value so to get all values we put while loop              
        System.out.println(itr.next());     // printing using iterator method
        }

        System.out.println();


        //print all values
        for(int n : arrl){
            System.out.println(n);  // printing using enhanced foor loop
        }


    }
}


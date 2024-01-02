import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList_JavaCollection {
    public static void main(String[] args) {
        
       // Collection<Integer> arrl = new ArrayList<Integer>(); // if you only want to traverse the value then use Collection But if you want to access element by index then use List
        List<Integer> arrl = new ArrayList<Integer>(); //because List provides the feature to access and insert element by its index
        arrl.add(2);
        arrl.add(34);
        arrl.add(23);
        arrl.add(984);
        arrl.add(2);   // ArrayList can have duplicate values

        System.out.println("Index is: " + arrl.indexOf(23));   // can;t be done with Collection Class thats why we used the List class

        System.out.println("Element: " + arrl.get(3));

        for(int n : arrl){
            System.out.println(n);
        }

        //in arraylist you the are get printed in sequenced - as they were get inserted 

        //refer output forgeting the output format

        // arrayList supports the duplicate values                      --  not supported by Set

    }
}

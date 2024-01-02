import java.util.List;
import java.util.Vector;

public class VectorJavaCollections {
    public static void main(String[] args) {
        

        List<Integer> vect = new Vector<Integer>();

        vect.add(23);
        vect.add(24);
        vect.add(423);
        vect.add(83);
        vect.add(21);
        vect.add(53);

        System.out.println("Index 3 : " + vect.get(3)); // printing value at index 3

        System.out.println("Number of elements present : " + vect.size());   //getting size of vector - number of elements present in vector

        System.out.println("Elements PRESENTS --");     // printing the vector elements
        for(int n : vect){
            System.out.println(n);
        }

        vect.add(5, 2345);  // adding number "2345" at "5th" index // if any element is there already then that element will shifted to next index

        System.out.println();

        System.out.println("after new insrtion at 5th index");

         for(int n : vect){
            System.out.println(n);
        }



    }
}

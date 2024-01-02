import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set is a collecton of unique values
// set does not have a getvalueof and get method like ArrayList 
//set doesn't have index value
 
public class SetJavaCollection {
    public static void main(String[] args) {
        
        Set<Integer> seti = new HashSet<Integer>();              // Set is a Interface
        seti.add(23);                                          // Hashset is a class
        seti.add(34);
        seti.add(54);
        seti.add(1);
        seti.add(54);   // this will con considered as a input because set collection does not conntains the Duplicate or repeated values - 54 ignored

         System.out.println("Unsorted with -- Hashset");
        for(int n : seti){          // Hashset doesn't provides the Sorted array   - soln is Treeset
            System.out.println(n);
        }

        System.out.println();

        //To get a sorted array 

        Set<Integer> seti2 = new TreeSet<Integer>();     //TreeSet provides use the sorted array 
        seti2.add(23);                                  // ignores the dupllicate value - here 54 is ignored
        seti2.add(34);
        seti2.add(54);                                              // Set is a Interface
        seti2.add(1);                                               // Treeset is a class
        seti2.add(54);

        System.out.println("Sorted with help of -- Treeset");
        for(int m : seti2){
            System.out.println(m);
        }


    }
}

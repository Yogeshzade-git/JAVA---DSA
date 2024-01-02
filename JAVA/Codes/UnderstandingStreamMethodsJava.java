import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class UnderstandingStreamMethodsJava {
    public static void main(String[] args) {
        
        List<Integer> arrl = Arrays.asList(2,6,3,7,1,8,10); 

        Stream<Integer> s1 = arrl.stream();

        //Understanding reduction of Stream<Integer> s2 = s1.filter(n -> n>5);
        // understanding the the filter method of stream class                    //used the documentation to understand the link-thinking- suchel mg tula - konti method ahe kay returntype ahe te
                                                                                                // use holding "ctrl" + Mouse over class you want info about
        // Predicate<Integer> p = new Predicate<Integer>() {       //original
        //     public boolean test(Integer n){
        //         //if(n>5)       as the if returns either true or false i.e Single stmnt so wee can just return the codition 
        //        // return true;
        //        // else
        //        // return false;

        //          return n>5;     // if its true return true and else return false
        //     }
        // };

        // as a "Predicate" is "Functional Inteface" so we can use "Lambda Expression" to reduce code

            // Predicate<Integer> p = n ->(n>5);    // reduced using lambda


         // Predicate<Integer> p = n ->(n>5);   // here we can see that p= expression
        // Stream<Integer> s2 = s1.filter(p);   // p is passed as a argument So instead of passing p
         // Stream<Integer> s2 = s1.filter(n -> n>5);   // directly passed the expression
    

        Stream<Integer> s2 = s1.filter( n ->(n>5));     /// filter is applied for printing values which are greater than 5;
        s2.forEach(n -> System.out.println("Filtered: " + n)); 
        };

      
    }


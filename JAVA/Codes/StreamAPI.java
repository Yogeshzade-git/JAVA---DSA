import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI{
    public static void main(String[] args) {
        
        List<Integer> arrl = Arrays.asList(2,4,10,7,3,6,8);

        System.out.println("Array :- " + arrl);
        System.out.println("------------------------------------------------------");

        Stream<Integer> s1 = arrl.stream();
        s1.forEach(n -> System.out.println("By forEach: " + n));
        System.out.println("--------------------------------------------------------");


        //print the sum of double of only even nnumbers present in array in array   - Ex : Evem no are 2,10,8,4,5  = Ans would be --> 48

        Stream<Integer> s2 = arrl.stream();
        Stream<Integer> s3 = s2.filter(n -> n%2==0);
        //s3.forEach(n -> System.out.println("Filtered: " + n));
        Stream<Integer> s4 =  s3.map(n -> n*2);
        //s4.forEach(n -> System.out.println(n));
        int result = s4.reduce(0,(subtotal,element) -> subtotal+element);   //storing s4 in result because reduce() returns the single value
        System.out.println("Result: "+result);

        System.out.println("--------------------------------------------------------");
        //doing the sam ethings as above to print the answer od addition of bouble of even numbers
        // "Shorthand" and "less line of code"

        int result2 = arrl.stream()                        // same like above but in less code
                          .filter(n -> n%2==0)
                          .map(n -> n*2)
                          .reduce(0 ,(SubTotal,Element) -> SubTotal+Element);

        System.out.println("Optimized - UsingStreamAPI - Answer:- "+result2);

        System.out.println("--------------------------------------------------------");
  
    }
}

 
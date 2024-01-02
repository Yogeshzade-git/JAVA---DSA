import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NeedOfStreamAPI{
    public static void main(String[] args) {
        
        List<Integer> arr = Arrays.asList(2,7,3,10,8,4,5);

        //print the sum of double of only even nnumbers present in array in array   - Ex : Evem no are 2,10,8,4,5  = Ans would be --> 48
            int sum = 0;
            
        for(int n : arr){       
                if(n%2==0){
                    n = n*2;
                    sum = sum + n;
                }
            }         

            System.out.println("Answer :- " + sum);
            System.out.println("----------------------------------------------------------------------------------------------");

        // ---------------------------------------------------------------------------------------------------------------------------------

        System.out.println("Elements In Array : " + arr);  // method - 1 for printing Array Elements

        System.out.println();

        for(int n : arr){       // method - 2 for printing Array Elements
            System.out.println("Elements:- " + n);
        }

        System.out.println();

        for(int i=0;i<arr.size();i++){          // method - 3 for printing Array Elements
            System.out.println("Array Elements: " + arr.get(i));
        }

        System.out.println();

        arr.forEach( n -> System.out.println("Element:--"+n));      // method - 4 for printing Array Elements


        //lets see how does method - 4 really get in such a small code

        // Consumer<Integer> con = new Consumer<Integer>() {             // Initial - raw
        //     public void accept(Integer n){
        //         System.out.println("Arr Ele: "+n);
        //     }
        // };

        // arr.forEach(con);


        // AS in above code the Consumer is a "Functional interface" so we can use "Lambda Expression" here
        //reduction by lambda expression

        // Consumer<Integer> con = n -> System.out.println("Arr Ele: "+n);                    // Lambda Expression Applied 
            
        // arr.forEach(con);


        // In above code if Observe carefully we are passign con obj in forEach method so directly passing the statement instead of statement

        System.out.println();                                                 // con = n -> System.out.println("Arr Ele: "+n);
        arr.forEach(n -> System.out.println("Arr Ele: "+n));                 // arr.forEach(con);
    }
}
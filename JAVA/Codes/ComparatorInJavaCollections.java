import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInJavaCollections{
    public static void main(String[] args) {
        

        //List<Integer> arrl = new ArrayList<Integer>();
        List<Integer> arrl = Arrays.asList(29,31,43,72);    // i want to sort it on basis of its unit place

        //Collections.sort(arrl);  // this method gives us a sorted array - but i eant to sort array by its unit place  //default ,ethod by java fpr sorting
                                // desired output is [31, 72, 43, 29]  - sorted by there unit value

                                // so here i will  write my custom sorting logic with help of "Comparator Interface"

        Comparator<Integer> com = new Comparator<Integer>() {   //when we want to apply the custom sorting logic we can appply a commaprator interafe technique
            @Override
            public int compare(Integer n1, Integer n2){
                if(n1%10 > n2%10)
                return 1; 
                else
                return -1;
            }
        };

        Collections.sort(arrl, com);   // passing the list object and aomparator inface object in this method

        System.out.println(arrl);   // printing sorted array



        //there is a another way for defining the customm logic for the sorting  i.e. Comparable interface

        //  which we inmplements the comaparable interface to that class add add logic to the compareTo method

        
    }
}
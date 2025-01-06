import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortStringLength {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        Comparator<String> comp = new Comparator<String>() {
            
            public int compare(String s1, String s2){
                if(s1.length() > s2.length()){
                    return 1;    // 1 means swap 
                }else{
                    return -1;   // -1means don't swap
                }
            }
        };

        ArrayList<String> list = new ArrayList<>(Arrays.asList("abvc","sdf","we","wtwerg","a"));

       // Collections.sort(list, comp);

        Collections.sort(list, (String s1, String s2) ->{
            if(s1.length() > s2.length()){
                return 1;
            }else{
                return -1;
            }
        });

        System.out.println(list);
    }
}

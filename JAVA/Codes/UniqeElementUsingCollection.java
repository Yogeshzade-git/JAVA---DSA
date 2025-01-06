import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;



public class UniqeElementUsingCollection {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(new ArrayList<>(Arrays.asList(12,23,345,56,23,12,123,34)));
        System.out.println(hashSet);

        // HashSet<Integer> hashSet = new HashSet<>(new ArrayList<>(List.of(12,23,345,56,23,12,123,34)));
        // System.out.println(hashSet);
    }
}

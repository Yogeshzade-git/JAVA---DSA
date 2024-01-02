import java.util.HashMap;
import java.util.Map;

public class MapJavaCollection {
    public static void main(String[] args) {
        
        Map<String, Integer> student = new HashMap<>();

        student.put("Yogesh", 72);
        student.put("Sagar", 22);
        student.put("Nikhil", 92);
        student.put("Pratik", 62);

        System.out.println("Total Elements:-> " + student);    // prints the key and assosiated valued with it

        System.out.println("Yogesh's Marks: " + student.get("Yogesh"));

        System.out.println("Keys: " + student.keySet());
        System.out.println();

        System.out.println("The Students and Marks");
        for(String s : student.keySet()){
            System.out.println(s + " : " + student.get(s));
        }

       student.put("Sagar", 43); //Sagar's age will be updates with marks, in MAP key's is s unique key


       //after updation of sagar's(key) marks (value)
        System.out.println("The Students and Marks");
        for(String s : student.keySet()){
            System.out.println(s + " : " + student.get(s));         // m ap is set type so it will give unsorted output sequence
        }


        //hashmap is combination set class and List 

        //we also have 




    }
}

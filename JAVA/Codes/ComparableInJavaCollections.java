import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// in this concapt we are going to study about the comparable interface as we has seen in the comparator interface is used for the 

class Studentss implements Comparable<Studentss>{

    String name;
    int age;

    public Studentss(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Studentss [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Studentss that) {
        if(this.age > that.age)
        return 1;
        else
        return -1;
    }

}

public class ComparableInJavaCollections {
    public static void main(String[] args) {
        
        List<Studentss> studs = new ArrayList<Studentss>();

        studs.add(new Studentss ("Yogesh", 29));
        studs.add(new Studentss ("Sai", 31));
        studs.add(new Studentss ("Ram", 72));
        studs.add(new Studentss ("Gayatri", 2));

        System.out.println("UNSORTED ARRAY OBJECTS");
        for(Studentss s : studs){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("SORTED ARRAY OBJECTS - by Age");

        Collections.sort(studs);
        for(Studentss s1 : studs){
            System.out.println(s1);
        }
        
 
    }
}

class B extends Object{

}

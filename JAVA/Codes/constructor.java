
class user{
    int age;
    String name;

    public user(){      // Constructor

        System.out.println("In constructor !!");      //this will get executed whenever object is created 
        age = 23;               
        name = "Yogesh"; 
    }
}

public class constructor {
    public static void main(String[] args) {
        
        user u = new user();  //every time object is created, constructor will be get called
        System.out.println(u.name + " | " + u.age );

        user u2 = new user();

    }
}


// Encapsulation - when want to achieve a privacy or security you can use encapsulation in which the variable or methods declared as "private" can't be accessed directly 
//                 from other class or main method or from outside the class by using the objects.

             // the instance variables should always declared as a private variables --- its Good  PRACTICE

class human{
                            // I want to make age and name not accessible directly by any other - to achieve that we used encapsulation
    // int age = 20;
    // String name = "Yogesh";   // this are accessible outside the class and inside also 

        // To achieve Encapsulation make variables -->  private
    private int age;
    private String name;     // Both are instance variables 

    public int getAge(){      // method to return "age" 
        return age;
    }

    public void setAge(int a){     // method to assigned value to "age"  // method accepts int a <-- "age" as a pararameter 
        age = a;                     // as we assigning value so we don't need to return anything so thats why we use Void 
    }

    public String getName(){      // method to return "name"
        return name;
    }

    public void setName(String n){       // method to assigned value to  "name"     // mehtod accepts String n <-- "name" as a pararameter 
        name = n;                        // as we assigning value so we don't need to return anything so thats why we use Void 
    }

}

public class encapsulation{
    public static void main(String[] args) {

        human h1 = new human();

        // System.out.println(h1.age + " | " + h1.name);     // It will give error that is can't able to access from outside the class
                                                            // here we can't access the private variable directly 

        // To assigned values to the variables which are private we again have to use methods only
        h1.setAge(20);          // 20 value will assigned to "age" variable  
        h1.setName("Yogesh");   // Yogesh string will assigned to "name" variable  


        // only way to access the private variables are Using methods

        System.out.println(h1.getAge() + " | " + h1.getName());    // here methods are used to access the "name" and "age"

                
        // In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can 
        // only be accessed within the class. To allow outside access to the instance variables, public methods called getters and setters are defined, 
        // which are used to retrieve and modify the values of the instance variables, respectively. By using getters and setters, 
        // the class can enforce its own data validation rules and ensure that its internal state remains consistent.


        
    }
}
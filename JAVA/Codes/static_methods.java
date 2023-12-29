
class mobilephone1{

    int prize;   // this is a non-static variable
    String brand;
    static String name;   // this is a static varuiable

     public void show(){            // this is non-static method  and it needs to create a object to execute it
        System.out.println(" In non-static method ");
        System.out.println(prize + " | " + brand + " | " + name );
    }

                                        // static methos doesn't need to create object to execute the method
    // public static void show1(){
    //     System.out.println("In Static Method");                     // we can't use non-static variables in static method 
    //     System.out.println(prize + " | " + prize + " | " + name );      // --> to use the you have to follow below approach
    // }

    public static void show1(mobilephone1 obj){         // here we used a obj as a parameter to make possible to access non-static variable in static method
        System.out.println("In Static Method");
        System.out.println(obj.prize + " | " + obj.brand + " | " + name );   
    }
}


public class static_methods {
    public static void main(String[] args) {     // So, why we write main as static method - 
                                                 //so if we not write it as a static method then it needs to create a object of class in which it resides but 
                                                 //we know tha ain methos is a entry point to the execution in java - 
                                                 //so if the execution will not start then how does a object will get created
                                                 // -- so that's wht we uses a mai method as static method 
        
        mobilephone1 mph1 = new mobilephone1();
        mph1.prize = 2300;
        mph1.brand = "Samsung";

        mobilephone1 mph2 = new mobilephone1();

        mph1.show();
        mph2.show();

        mobilephone1.show1(mph1);  // we are passing the mph1 object as a argument to the static method to use non-staic variable in static method

    }
}

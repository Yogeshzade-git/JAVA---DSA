
class Vehicle{  // Parent  Class

    public void run(){    // method in parent class with name run() available in child class with same name so it will override this method of parent class
        System.out.println("Vehicle running !! ");
    }

}

class Bike extends Vehicle{  // Child Class

    /// In method Overridingthe method name and the number and type of parameter should be same 

        // At the time of execution child first check for method in itself and then search inside parent  --> preference is given to the child first 

    public void run(){       // run() method in parent class is override by this child class
        System.out.println("Bike running !! ");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {

        Vehicle v = new Bike();  //Dynamic Method Dispatch
        v.run();        // o/p ---->   Bike running !!
        
    }

    // JAVA doesn't supports the multiple inheritance  --> we used interface for solving that issue

}
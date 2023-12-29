
class A extends Object{     // every parent class is extends the Object class

    public A(){    // even if its we dont mentioned it. it lies there in first instruction of " EVERY CONSTRUCTOR "
        super();  // by default each constructor has super() inside in at starting  
        System.out.println(" In A Constructor");      // super() method is is present at 1st instruction of Each And aEvery CONSTRUCTOR
    }

    public A(int n){
        System.out.println("In int A constructor");
    }
}

class B extends A{

    public B(){
        super();  // every constructor has a super method as a 1st instruction even if we doesn't mentioned it.
        System.out.println(" In B Constructor");
    }

     public B(int n){
        super(); 
        System.out.println("In int B constructor");
    }
}

public class superKeyword {
    public static void main(String[] args) {

       // A a = new A();
        B b = new B();
        System.err.println();

        B b1 = new B(3); // to call parameterized constructor explicitly
        
    }
    
}

// B b = new B();
// the level of execution is like this  Object --> A() " In A Constructor" --> B() "In B Constructor"

 //B b1 = new B(3);
 // the level of execution is like this  Object --> A() " In A Constructor" --> B(int n) "In int B constructor""

class G {  // outer main class    contains inner class

    int num1 = 34; 
    int num2 = 17;

    public void show(){
        System.out.println("in G Show");
    }

    class H{  // inner class , it can access all the members of the outer class, including private data members and methods. 

        public void config(){
            System.out.println("in H Config -- inner class " + num1 + " | " + num2);
            show();
        }
    }

    static class K{   // static inner class 

        public void run(){
            System.out.println("in K run -- static inner class ");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        G obj1 = new G();
        obj1.show();
      //  obj.config();  X   // to access this method we need object of H class 

     //   H obj2 = new H();  // this will not gonna work, it will throw an error   --> To resolve we have to give the reference of outer class - here i.e. G class

       G.H obj2 = obj1.new H();   //creating object of inner class -- we have to giv eouter class reference and also the  outer class object's reference also to this class object
        obj2.config();

        G.K obj3 = new G.K();   // object creation for static class
        obj3.run();
        
    }
}

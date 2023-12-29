
abstract class Toy{   //abstract class
    public abstract void playToy();  // abstract method

     public void buyToy(){      // normal method
                 System.out.println("Toy Bought....");
            }
}

// class elephant extends Toy{  //concrete class    - To access playToy ,ethod of Toy cals have to create object of concrete class

//     public void playToy() {  
//        System.out.println("Toy playing....");
//     }
// }

public class AbstractAndAnonymousInnerClass {

    public static void main(String[] args) {

        //creating object of concrete class with abstract class's reference variable to access playToy method
        // Toy obj = new elephant();
        // obj.playToy();

        // instead of creating concrete class to use method of abstract class, just implemetn the mathod inside the inner class

       // AbstractAndAnonymousInnerClass implentation code here below
       Toy obj = new Toy() {
        
            public void playToy(){
                 System.out.println("Toy playing....  -- inner class");
            }

             public void buyToy(){
                 System.out.println("Toy Bought....  -- inner class");
            }

       };
       
       obj.playToy();
       obj.buyToy();
        
    }
}
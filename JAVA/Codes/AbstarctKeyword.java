
// abstract keyword is used to declare abstract method
// if any class contains "abstract methods" that class should be declared as "abstract class"
// an abstract class can contains multiple abstract methods and normal methods also;    there is no compulsion to have abstract method inside abstract class it can have only normal methods also
// if any class extends the abstract class then it have to declare the all the abstract methods which are present in the abstract class in to itself 
//  This type of class known as a "Concrete class"
// we can't create a "object" of abstract class, so to access its methods we have to create a object of "Concrete class" with abstact class as reference variable



abstract class car{      // abstract class
    public abstract void drive();  // abstract method

    public void playMusicOn(){  
        System.out.println("Music Palying ...");
    }
    
}

    // Thar is a concrete class

class Thar extends car{  //if class  extends the abstract class, it has to implement all abstract methods of parent class or the extended abstract class here is "car"

    public void drive(){                                  // abstract method of "car" class is implemnted here
        System.out.println("car is driving ...");
    }

}

public class AbstarctKeyword {
  public static void main(String[] args) {

//    car c = new car();  // not allowed to create object  of abstract class so we have to create a object of "concrete class" i.e here "Thar" class's object
    
   car c = new Thar();           // Both approaches are allowed to acces the method of abstract class -  0nly thing is to only allowed to create a object of concrete class
    c.drive();
    c.playMusicOn();

    System.out.println();

    Thar t = new Thar();      // Both approaches are allowed to acces the method of abstract class  -  0nly thing is to only allowed to create a object of concrete class
    t.drive();
    t.playMusicOn();
  }  
}

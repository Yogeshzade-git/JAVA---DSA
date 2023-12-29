
class Anony{
 
    public Anony(){
        System.out.println("Inside Anony Constructor !!");
    }

    public void showMyExistance() {
        System.out.println("Hello I am in Existance :-)");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        
            // Anony a = new Anony();  // simple object // reference object

            // Anony a;               // object creation in different way
            // a= new Anony();

            new Anony();  // Anonymous Objects

            //can be used as ordinary object but only once, 
            //if we try to use it multile times it will again and again calls constructor and creates new objects

            // new Anony().showMyExistance(); // used as a simple object

            // new Anony().showMyExistance();  // this will call constructor again and create new object again
    }
}

class Aa{
    public Aa(){
        System.out.println("Inside Aa constructor!!");
    }
}

class Bb extends Aa{
    public Bb(){
        System.out.println("Inside Bb constructor!!");
    }

    public Bb(int a){   // parameterized constructor 
                  // it is used to call the constructor of same instance -> if psdd parameter then will call that constructor -- so tell according  
        this();  // because we want to call the main default constructor (as this() no args means default vonstructor) of the class also that's why we used this keyword 
        System.out.println("Inside Bb Int constructor!!");
    }
}

public class thisMethosd {
    public static void main(String[] args) {
        
        Aa a = new Aa();
        System.out.println();

        Bb b = new Bb(2);
    }
}

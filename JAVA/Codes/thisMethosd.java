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
        this();  // because we want to call the main default constructor of the class also that's why we used this keyword 
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


//class - class -->> extends
//class - Interface -->> implements
//Interface - Interface -->> extends

interface car{

    void drive();
    void speedUp();
}

interface plane{
    void fly();
    void takeOff();
}

interface boat extends car{

}

class Vehicle1 implements car,plane{

    public void drive(){
        System.out.println("Vehicle1 driving !!");
    }
    public void speedUp(){
        System.out.println("Vehicle1 speeding Up !!");
    }


    public void fly(){
        System.out.println("Vehicle1 flying !!");
    }
    public void takeOff(){
        System.out.println("Vehicle1 taking off !!");
    }

}

class vehicle2 implements boat{

    public void drive(){
        System.out.println("vehicle2 driving !!");
    }
    public void speedUp(){
        System.out.println("vehicle2 speeding Up !!");
    }
}

public class IntefaceMultiple {
    public static void main(String[] args) {

        car obj = new Vehicle1();
        obj.drive(); 
        obj.speedUp(); 

        plane obj2 = new Vehicle1();
        obj2.fly(); 
        obj2.takeOff();

        boat obj3 = new vehicle2();   // as vehicle2 class implements the boat interface and boat interface extends the car interface (his methods and properties)
        obj3.drive(); 
        obj3.speedUp(); 
    }
}

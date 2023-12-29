
// when we declarwe any variable with static keyword, that variable's value is same for all objects    
                        // yes each object can have different values but not in this case of  "static" variable condition

class mobile{

    String brand;
    int price;
    static String name;      /// this will be same for each object    / /  ceck output for explanation

    void show(){
        System.out.println(brand + " : " + price + " : " + name);     // static variable can be used by non static methods
    }
}

public class static_keyword {
    public static void main(String[] args) {
        
        mobile m1 = new mobile();
        m1.brand="Apple";
        m1.price=1200;
        // m1.name="Smartphone";   // name is a static variable so always access with class name
        mobile.name="Smartphone";   ///// static variable always accessed with class name i.e. ** mobile

        mobile m2 = new mobile();
        m2.brand="Samsung";
        m2.price=1000;
        // m2.name="phone";     // name is a static variable so always access with class name
        mobile.name="phone";   /// this will assign value to name lastly and then methods had been called so name will refered as a " phone " by all objects
        ///// static variable always accessed with class name i.e. ** mobile

        m1.show();
        m2.show();

    }
}

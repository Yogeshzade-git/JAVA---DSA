interface S{   // interface declaration

    // abstract void show();            --> Bydefault methods in intefaace are of abstract  type we dont need to mentioned it as abstract explicitely
    // abstract void config();

    // we can use variables in interface but they are bydefault "final" and "static" in nature 

    void show();   // final & static  bydefault
    void config();  // final & static  bydefault

    // In interface the variables are are static ad final 

    int age = 20;
    String name= "Yogesh";

}

class T implements S{    // to use interface inmplements keyword is used

    public void show(){     // mandatory to be decalred because its in interface and we implements S interfce in this class
        System.out.println("in T show");
    }

    public void config(){   // mandatory to be decalred because its in interface and we implements S interfce in this class
        System.out.println("in T config");
    }

}

public class Interface{
    public static void main(String[] args) {

 //like an abstract class we can't create an object of interface to access the methods so we will make object of class who implents the interface and use interface as a reference variable
        S obj = new T();
        obj.show();
        obj.config();

    //  S.age = 45;  // X   --> Error will occur  -->> age is declared in interface means its a bydefault final and static type so as its "final"  so we can't update value

        System.out.println("Age: " + S.age);   // as age is a static variable so it can be access with class name directly
        System.out.println("Name: " + S.name);   // as name is a static variable so it can be access with class name directly
    }
} 

interface Computer3{
    void code();  // bydefault  public & abstract
}

class Laptop implements Computer3{
    public void code(){
        System.out.println("Code - Copile - Rune (Laptop) ");
    }
}

class Desktop implements Computer3 {
     public void code(){
        System.out.println("Code - Copile - Rune (Desktop) Faster ");
    }
}

class Devloper {
    public void devApp(Computer3 cmp){   // accepting the Laptop class's object as parameter 
        cmp.code();  //calling the code() method of Laptop class
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {

        // Laptop lap = new Laptop();
        
        // Devloper dev = new Devloper();
        // dev.devApp(lap);   // passing lap as argument

        // But company can say to developer to develop app on desktop instead of desktop for that reson we can use interface in this way 

        Computer3 lap  = new Laptop();
        Computer3 desk = new Desktop();
        
        Devloper dev1 = new Devloper();
        dev1.devApp(lap);

        Devloper dev2 = new Devloper();
        dev2.devApp(desk);
        
        
    }
}

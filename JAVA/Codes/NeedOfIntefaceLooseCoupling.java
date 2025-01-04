
interface Computer {

    void code();
}

class Desktop implements Computer{

    @Override
    public void code() {
       System.out.println("Code using Desktop");
    }

}

class Laptop implements Computer{

    @Override
    public void code() {
        System.out.println("Code using Laptop");
    }
    
}


class Developer {
    public void code(Computer comp){
        comp.code();
    }
}


public class NeedOfIntefaceLooseCoupling{
    
    public static void main(String[] args) {
        
        Computer compDesktop = new Desktop();  // dynamic method dispatch
        Computer compLaptop = new Laptop();  // dynamic method dispatch

        Developer developer = new Developer();

        developer.code(compLaptop);
        developer.code(compDesktop);


    }
}
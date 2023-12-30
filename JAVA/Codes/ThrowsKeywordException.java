
class W{
    public void show(){
        try{
       //Class.forName("ThrowsKeywordException");
         Class.forName("ThrowsKeywordException");
        }catch(ClassNotFoundException e){
            System.out.println("Class Doesn't Exists Here!!");       // this is on eof approach to handl the "checked Exceptions"
        }
    }
}

class V{
    void print()throws ClassNotFoundException{      // throws keyword tells parent to handle the Exception
        Class.forName("z");
    }
}

public class ThrowsKeywordException {

    static{     // static block is executed when class is loaded    
        System.out.println("In static");   // used here for just to print something
    };

    public static void main(String[] args) {

        W pbj = new W();
        pbj.show();

        V obj2 = new V();
        //obj2.print();  // this says to handle the exception

        try{
            obj2.print();
        }catch(ClassNotFoundException e){
            System.out.println("Class Doesn't Exists Here!! from class V");
        }
        
    }
}

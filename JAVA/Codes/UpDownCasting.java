
class P{
    public void show1(){
        System.out.println("in O Show");
    }
}

class Q extends P{
    public void show2(){
        System.out.println("in Q Show");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        
        double d  = 34.5;
        int i = (int) d;  // double can;t be get converted to the Integer so we does a type casting (int)
        System.out.println(d);
        System.out.println(i);

        //P obj1 = (P) new Q();  // we don't need to mentioned it auoutomatically recognized by the (JVM)
          P obj1 = new Q();   // Up casting   // P is main shooter
        obj1.show1(); 

        Q obj2 = (Q) new P();  // Down casting     // Q is main shooter
        obj2.show2();

    }
}

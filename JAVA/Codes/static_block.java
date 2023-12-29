
class mobilephone{

    int prize;
    String brand;
    static String name;   // static variable declaration

                    // this is a static block - static variable are initialized in this block
                        //Firstly class loads and then objects are instantiated  thats why the its statement prints first   
                        // static block called once by class loader
    static{             // it only gets called if class's object is created   // if you want to do it without object creation then there is a way
                                                                            // by using a method ---- Class.forName("mobilephone")  <-- class name inside ""

         name = "phone"; // you have to declare a static variable in class first and then in static block you initilize the values to that static variable
        
        System.out.println(" Inside the Static Block ");
    }


    public mobilephone(){    // this is constructor - is get called everytime whenever object is created 
                            // here mph1, mph2 these 2 objects are created so its called 2 times

        prize = 2000;       // default initialized - - initially vales are assigned
        brand = "Apple";                // can be get changed later

        System.out.println(" Inside the Costructor ");   //mph1, mph2 these 2 objects are created so its executed 2 times
    }


    public void print(){
        System.out.println(prize + " | " + prize + " | " + name );
    }

}

public class static_block {
    public static void main(String[] args) throws ClassNotFoundException {
        
        mobilephone mph1 = new mobilephone();
        mph1.prize = 2300;
        mph1.brand = "Samsung";
        //mobilephone.name= "smartphone";  <-- this will make name="smartphonme or every object o this class"

        mobilephone mph2 = new mobilephone();

        mph1.print();
        mph2.print();


        // Class.forName("mobilephone");   // this will loads class even if class objects are not created   
        //                                             // it will show output --->   Inside the Static Block    <-- only

    }
}

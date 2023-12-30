
// Enum can have mthods , vaariable and constructors

enum Computer{
    MACBOOK(2000), XPS(1600), SURFACE, THINKBOOK(2200);  // this are the objects of enum Computer class which are known as a fixed constants

    private int price = 1000;  // this will assigned as a price to the constants which does not have values with them


    //we are using the constructors as private because we are creating the objects in same class and private allows us to do it

    private Computer(){   // this constructor will get called once
        this.price = price;   // SURFACE will refer this value as a price
    }

    private Computer (int price){   // this constructor will get called 3 times 
        this.price = price;
        System.out.println("For the " + this.toString());   // you can also use this.name() method instead of this.toString() method
    }

    public int getprice(){
        return price;
    }

    public void setprice(int price){
        this.price = price;
    }

}

public class EnumMethodsVariables {
    public static void main(String[] args) {

        for(Computer c : Computer.values()){
            System.out.println(c + " : " + c.getprice());
        }
        
    }
}

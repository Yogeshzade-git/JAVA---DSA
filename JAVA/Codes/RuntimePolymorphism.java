//This is a code for understanding Dynamic Memory Dispatch


// class Computer {

//     public void show(){
//         System.out.println("In Computer class");
//     }
// }

// class Laptop extends Computer {

//     public void show(){
//         System.out.println("In Laptop class");
//     }
// }

class Aaa{
    public void show(){
        System.out.println("In A class");
    }
}

class Bbb extends Aaa{
    public void show(){
        System.out.println("In B class");
    }
}

class Ccc extends Aaa{
    public void show(){
        System.out.println("In C class");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        
        // Computer obj = new Laptop();   // it will call method of Laptop class because we are creating object of Laptop class and reference variable of Computer class only
        // obj.show();     // --> "In Laptop class"

        Aaa obj = new Aaa();
        obj.show();   // That method will get called whoes object is created here is Aaa's,  obj will refers to the Aaa's object address in stack memory to heap memory
                    //  o/p --> In A class  

        obj = new Bbb();  
        obj.show();    // That method will get called whoes object is created here is Baa's,  obj will refers to the Baa's object address in stack memory to heap memory
        //  o/p --> In B class

        obj = new Ccc();
        obj.show();    // That method will get called whoes object is created here is Caa's,  obj will refers to the Caa's object address in stack memory to heap memory
        //  o/p --> In C class

    }


    // o/p  -->>  In A class
    //            In B class
    //            In C class
}

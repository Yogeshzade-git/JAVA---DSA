
//enum can be defined inside the class and outside the class
// enum can have methods, contructors and variables

enum Status{  // it is nothinf but a class
    RUNNING, SUCCESS, FAILED, PENDING;   //these are the objects or you can say that these are the constants
 //   0        1        2       3        <<-- these are the index of each constant
}

public class EnumsInJava {
    public static void main(String[] args) {

         Status s = Status.RUNNING;  //to access these constants we have to store constant value in "variable" of type "enum" 
         System.out.println(s);                                  // which is name that we declare above at starting i.e. "Status"
       
         Status ss[] = Status.values();
         System.out.println(ss);  // will provide a hexcode so will use to get value by index of array

         System.out.println(ss[2]);     // this will print the FAILED coz its at 2th index

         //  valueOf() <<-- this returns the value of constant
         System.out.println(Status.valueOf("SUCCESS"));

         //  ordinal()  <<-- this method is used to get the index of that constant
         System.out.println("PENDING: 🔥" + Status.valueOf("PENDING").ordinal());  
         System.out.println();


         // we can traverse th eenum with help of for loop 
         for(Status e : ss){        // e is of type Status
            System.out.println(e + " : " + e.ordinal());   // here we can iterate the enum with there index also by help of  ordinal method
         }

    }
}

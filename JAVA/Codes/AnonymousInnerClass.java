
class School{

    public void exam(){              //original behaviour 
        System.out.println(" in School exam ");
    }
}

// class HighSchool extends School{

//      public void exam(){          // changed behaviour (want to achieved wala ahe he)       
//         System.out.println(" in HighSchool exam ");
//     }
// }

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // School obj = new HighSchool();         // here i wanted to achieve different behavoiour for School class that's why we used method overloading 
        // obj.exam();                            // But while doing this we need to ccreate neew class and thats th econcern -- so to overcome this we have AnonymousClass concept
        
       // To achieve a different behaviour from School class without creating new class and all that stuff simply use below method
        

                 //ordinary creation of object 
                School obj = new School(){

                    //this will be our anonymous innerClass
                    public void exam(){      // This method will override the original methos of School class
                        System.out.println(" in HighSchool exam -- in Anonymous inner class ");
                    }
                };

                obj.exam();
    }
}

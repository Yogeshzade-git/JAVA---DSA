
//An Interface that contains exactly one abstract method is known as functional interface. 
//From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.

@FunctionalInterface
interface I{

    void j();
}

// class K implements I{                          // we can do this with inner class approach 

//     public void j(){
//         System.out.println("in K's J method");
//     }
// }

@FunctionalInterface
interface IwithReturn{         // functional interface with returntype int
    int jWithReturn(int n1, int n2);
}

public class Functionalinterface {
    public static void main(String[] args) {

        I obj = new I(){      // inner class
                public void j(){
                    System.out.println("from the inner class");
                }
            };
            obj.j();


        IwithReturn obj2 = new IwithReturn() {        // inner class with return
            public int jWithReturn(int n1, int n2){
                return (n1+n2);
            } 
        };
        int result = obj2.jWithReturn(3, 6);
        System.out.println("Addition: " + result);
    }
}

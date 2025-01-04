//An Interface that contains exactly one abstract method is known as functional interface. 
//From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.

//"inner class" method is replace by the "Lambda Expression" ** only used with/for "Functional Interface" 

@FunctionalInterface
interface NoParaInterface{      // no parameter 
    void show();
}

@FunctionalInterface
interface OneParaInterface{      // one parameter 
    void print(String name);
}

@FunctionalInterface
interface MultiParaInterface{      // multiple parameter   // with returntype value int
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        // NoParaInterface npi = new NoParaInterface() {     // using  Anonymousinner class
        //     public void show(){
        //         System.out.println("The No Parameter Functional Interface");
        //     }
        // };
        // npi.show();

        //Using Lambda Expression
        NoParaInterface npi = () ->  System.out.println("The No Parameter Functional Interface");   // lambda expression used "->"  is a lambda expression    
        npi.show();



        // OneParaInterface opi = new OneParaInterface() {     // using inner class
        //     public void print(String name){
        //         System.out.println(name);
        //     }
        // };
        // opi.print("Yogesh Zade");

         //Using Lambda Expression   // if (name) contains only one variable we can remove() so used only "name"
           OneParaInterface opi = name -> System.out.println(name);   // lambda expression used "->"  is a lambda expression   
           opi.print("Yogesh Zade");



        // MultiParaInterface mpi = new MultiParaInterface() {     //using inner class    // with return value
        //     public int add(int n1, int n2){
        //         return n1+n2;
        //     }
        // };
        // int result = mpi.add(23, 54);
        // System.out.println("Addition: " + result);


        //Using Lambda Expression
       // MultiParaInterface mpi = ( n1,n2) -> return (n1+n2);        // lambda expression used "->"  is a lambda expression

       // if you have single statement after "->" ans that is "return" then you have to remove "return"
        MultiParaInterface mpi = (n1,n2) -> (n1+n2);        // lambda expression used "->"  is a lambda expression
            
        int result = mpi.add(23, 54);
        System.out.println("Addition: " + result);

        //lambda expressions are widely used in the java collections
        
    }
}

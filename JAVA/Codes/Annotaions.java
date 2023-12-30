//Java Annotation is a tag that represents the metadata  
//i.e.attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

@Deprecated
class Animal{
    public void eatSomething(){
        System.out.println("in Animal");
    }
}

class Dog extends Animal{

    // @Override                                 // uncomment to see the compiler suggestions that help to reduce bugs
    // public void eatsomething(){               // it should be eatSomething  (Capital S)
    //     System.out.println("in Dog");
    // }

    @Override              // this @Override tag will tell compiler that this methoud should override - if its not then compile time error will occur
    public void eatSomething(){
        System.out.println("in Dog");
    }
}


public class Annotaions {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eatSomething();    // O/p -->> The output is not matching the expectations --> its known as a bug --> they can be occur by silly mistakes 
                                // here if observed carefully the eatSomthing() method in Animal calss has S (Capital s) 
                                // and Dog class has method which wanted to be overriden has (small s) as prograammer expects to overloading should perform but its no perform so here bug occurs
                                // to overcome these problems we use Annotaions which tell scompiler about our expectation or what we we wnat to do 
                                // there multiple annotations are there Ex - @override, @Deprecated, @Target, @Inherit, etc.
    }
}

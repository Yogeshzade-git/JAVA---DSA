
// final is used with --> variabel, class, method

// fianl variable -->> make variable constant (can't be changed)

// final class -->> can't be inherited by any other class --> no one class can extends properties of final class 

// final method -->> final method can't be overriden by any other method

final class M{        // M class declared  as a final class

}

// class N extends M{    class can't exrtends class M because, M is declare as  a final class

// }

class X{

    final public void show(){                  // method declared as a final
        System.out.println("In X class");
    }

    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}

class Y extends X{

    // public void show(){                        as the show() method in class X which is parent class is declared as a final methos so i can't be get overriden
    //     System.out.println("In Y class");
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
                                                    // variable declared as a final 
        final int  ID = 72;     // once it declared as a final variable it can't be get changed 
        // ID = 45;      -->> this will throw an error   // final variable is used for declaring constant values


        Y y = new Y();
        y.show();
        y.add(2, 6);



        
    }
}

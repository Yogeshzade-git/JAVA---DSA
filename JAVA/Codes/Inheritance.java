class Calc{  //parent   level0  --> parent of AdvCalc

    public int add(int n1, int n2){
        return n1 + n2;
    }

     public int sub(int n1, int n2){
        return n1 - n2;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc c = new VeryAdvCalc();
    int add = c.add(2, 3);
    int sub = c.sub(12, 3);
    int mul = c.mul(12, 3);
    int div = c.div(12, 3);
    double pow = c.pow(2,4);

    System.out.println("Addition: "+add + " | " + "Substraction: "+sub);
    System.out.println("Multiplication: "+div + " | " + "Dividation: "+mul);
    System.out.println("Power: " +pow );
    }

// Multilevel Inheritance 
//  (Main Parent) Calc <-- AdvCalc <-- VeryAdvCalc <--
//                                     (child)

}

class calculate{

    public int add(int n1, int n2, int n3){

        return n1+n2+n3;
    }

    public int add(int n1, int n2){

        return n1+n2;
    }

    public float add(float n1, int n2){

        return n1+n2;
    }

}

public class methodOverloading {
    public static void main(String[] args) {
        
        calculate cal = new calculate();

        System.out.println("result : " + cal.add(2,3));
        System.out.println("result : " + cal.add(34,23,5));
        System.out.println("result : " + cal.add(3.45f,21));

    }
}

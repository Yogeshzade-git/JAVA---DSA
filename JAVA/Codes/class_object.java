
class calculator{
    public int add(int n1, int n2){
        int res = n1 + n2;
        return res;
    }
}


public class class_object {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 10;

        calculator c = new calculator();   
        int result = c.add(num1, num2);

        System.out.println("Addition :- " + result);

    }
}


public class Exceptions {
    public static void main(String[] args) {
         
        int i = 0;
        int j = 18;

        try{
            j= j/i;     // critical code with place in this block
        }catch(Exception e){
            System.out.println("Something went wrong!!!");   // catch block code will ionly get executed if exception occurs
        }

        System.out.println("Result: " + j);
    }
}

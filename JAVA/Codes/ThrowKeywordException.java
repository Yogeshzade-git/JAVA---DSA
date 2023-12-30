

public class ThrowKeywordException {
    public static void main(String[] args) {
        int i = 2;
        int j = 18;

        int arr[] = new int[3];

        try{
            j = j/i;
            System.out.println(arr[1]);
            System.out.println(arr[4]);   // try to print out of limit index value
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero(0)"); 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter the array index in limit");
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Result: " + j);   // above code is for Multiple catch blocks

        class MyException extends Exception{

            public MyException(String str){
                super(str);
            }
        }

        int x = 0;
        int y = 12;

        try{
            if(x == 0) throw new MyException("Denominator can't be a ZERO(0)");   // here we declared Custom Exception  with throw keyword
            y = y/x;
            
        }catch(MyException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Result2: " + y);

    }
}

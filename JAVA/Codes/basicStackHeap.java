
class calcu{

    int num = 5;  // instance variable - stored in heap memory inside the object data

    public int add(int n1, int n2){

        return (n1 + n2);   // n1, n2 are local variables - stored in stack with actual value
    }
}

public class basicStackHeap {
    public static void main(String[] args) {

        int data = 10;  // local variable - stored in stack
        System.out.println(data);
        
        calcu cal = new calcu();   // cal is a reference variable stored in stack with the address of heap memory 
        int ans_cal = cal.add(2, 43);

        calcu cal2 = new calcu();    // cal2 is a reference variable stored in stack with the address of heap memory 
        int ans_cal2 = cal2.add(2, 43);

        System.out.println(ans_cal);
       System.out.println(ans_cal2);

        cal.num = 10;                   // cal and cal2 Aare targeting the same variable num , as each object has its own data 
        System.out.println(cal.num);
                                                // here in output we cat clearly observed that the cal change num to 10 
        System.out.println(cal2.num);           // but while output the change only apper in case of cal object not in cal2

    }
}

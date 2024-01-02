import java.util.List;
import java.util.Stack;

public class StackJavaCollection {
    public static void main(String[] args) {
        
        List<Integer> stack = new Stack<Integer>();

        stack.add(34);
        stack.add(23);                                          
        stack.add(34);
        stack.add(54);
        stack.add(1);
        stack.add(54);

        System.out.println("Stack Size: " + stack.size());
        System.out.println("Stack 3rd Index Element: " + stack.get(3));  // just like a array indexing methodology/mechanism

        for(int n : stack){
            System.out.println(n);
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");


        Stack<Integer> stk = new Stack<Integer>();

        stk.push(3);
        stk.push(23);                                          
        stk.push(34);
        stk.push(3234);

        System.out.println("Peek: " + stk.peek());
        System.out.println("Capacity" + stk.capacity());

        System.out.println("Stack Elements: " + stk);
        for(int m : stk){
            System.out.println(m);
        }
        System.out.println();
        System.out.println(stk.pop() + " Element Poped!!");

        System.out.println();
        System.out.println("After pop() operation :->" + stk);

        for(int k : stk){
            System.out.println(k);
        }



    }
}

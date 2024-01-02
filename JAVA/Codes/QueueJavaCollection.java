import java.util.ArrayDeque;
import java.util.Queue;

public class QueueJavaCollection {
    public static void main(String[] args) {
        
        Queue<Integer> arrque = new ArrayDeque<Integer>();

        arrque.add(23);
        arrque.add(54);
        arrque.add(1);
        arrque.add(643);

        System.out.println(arrque.peek()); /// peeks the head element of queue (end element)

        System.out.println(arrque.poll());   // returns the head element and delete that elements also

        System.out.println(arrque.element());  // returrns head element

        System.out.println(arrque.remove()); // Retrieves and removes the head of this queue. 
                                            // This method differs from poll() only in that it throws an exception if this queue is empty.

        System.out.println();

        for(int n : arrque){    // printing elemetns in Queue
            System.out.println(n);
        }

    }
}

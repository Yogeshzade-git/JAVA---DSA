
class First extends Thread{
    public void run(){      // if we want to do thread operation we have make method name as a run and put code insidethat block
        for(int i=0;i<100;i++){
            System.out.println("HI");
            try {
                Thread.sleep(2);  // sleep thread for 2 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Second extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(2);  // sleep thread for 2 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPrioritySleep{
    public static void main(String[] args) {
        
        First obj1 = new First();
        Second obj2 = new Second();

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(Thread.MIN_PRIORITY);
        // obj1.setPriority(Thread.NORM_PRIORITY);
        
        obj1.start();  // in thread we call start() method to run thread  // here obj1 is refered as a thread reference to start execution
        obj2.start();

    }
}
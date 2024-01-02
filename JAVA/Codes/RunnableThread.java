
class F1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class S1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        F1 obj1 = new F1();
        S1 obj2 = new S1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
    }
}


// class F1 implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("HI");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// class S1 implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("HELLO");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

public class RnnableThreadLambdaExp {
    public static void main(String[] args) {      // try to use lambda expression here to reduce the code
                                                    // Runnable interface is a Functional Interface so we can use lambda expression
    //   Runnable obj1 = new F1();
    //   Runnable obj2 = new S1();

    Runnable obj1 = () -> {   //lambda
        for(int i=0;i<5;i++){
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    };

    Runnable obj2 = () -> {         //lambda
        for(int i=0;i<5;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
    }
    
}

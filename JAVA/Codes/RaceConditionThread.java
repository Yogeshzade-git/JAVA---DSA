
// Race condition is occurs when two or more threads tries to deal with same resource or th evariable - that result in the inconsistency of value of resource

class  Hero{
    int count;
    public synchronized void increment(){   // "synchronized"  this keyword mak emethod for allowing only one thread at a time to get executed
        count++;
    }
}

public class RaceConditionThread {
    public static void main(String[] args) throws InterruptedException {

        Hero hero = new Hero();

        Runnable r1 = () -> {
            for(int i=0;i<1000;i++){
                hero.increment();
            }
        };

         Runnable r2 = () -> {
            for(int i=0;i<1000;i++){
                hero.increment();
            }
        };

        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);

        th1.start();
        th2.start();

        th1.join();    // this will make force main method thread to wait for extecution of each thread with join() method 
        th2.join();   // this will make force main method thread to wait for extecution of each thread with join() method 

        System.out.println("Count: " + hero.count);
        
    }
}

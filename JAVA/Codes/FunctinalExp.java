
@FunctionalInterface
interface FunctinalExppp {

    int id = 10;


    abstract void methodName(String name);

    static int method1() {
        return 2;
    }

    default String method2(int x, float y) {
        return "Hello";
    }
}

public class FunctinalExp {

    public static void main(String[] args) {
        FunctinalExppp obj = name -> System.out.println("Hello Yogesh");
        obj.methodName("Yogesh");
        System.out.println(FunctinalExppp.id);
    }
}
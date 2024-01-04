 
 class Container<T>{

            T age;

            public void show(){
                System.out.println("Myage: "+age);
                System.out.println(age.getClass().getName());
            }
        }

public class GenericsInJava {
   
    public static void main(String[] args) {
        
        Container<Integer> obj = new Container<>();
        obj.age=21;
        obj.show();

    }
}

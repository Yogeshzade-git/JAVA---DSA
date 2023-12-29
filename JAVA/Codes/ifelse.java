public class ifelse {
    public static void main(String[] args) {

        int a=3, b=33, c=10;

        ternary obj = new ternary();
        obj.so(23,19);

        if(a>b && a>c){
            System.out.println("a= " + a);
        }else if (b>c) {
            System.out.println("b= " + b);
        }else{
            System.out.println("c= " + c);
        }

    }

}

 class ternary{

    void so(int x, int y){

        String result = x>=y?"a":"b";
        System.out.println("Greater Number is : "+result);
    }

}



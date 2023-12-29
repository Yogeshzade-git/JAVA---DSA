public class array {
public static void main(String[] args) {

    int arr[] = new int[4];

    // arr[0] = 3;
    // arr[1] = 4;            // insted of this we can use for loop here for this 
    // arr[2] = 6;
    // arr[3] = 8;

    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);
    // System.out.println(arr[3]);

    for(int i=0;i<4;i++){
        arr[i] = (int)(Math.random()*100);   // here we used random method to generate random numbers 
    }                                        //here we do typecasting of float to integer // because by default random method generates float values

     for(int i=0;i<4;i++){
        System.out.println(arr[i]);
    }
    
}
}

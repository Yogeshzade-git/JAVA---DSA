public class nestedWhile {
    public static void main(String[] args) {
        
        int i =0;
        while(i<4){
            System.out.println("Hi Buddy " + (i+1));
            int j =0;
            while(j<3){
                System.out.println("Hello!! " + (j+1));
                j++;
            } 
            i++;
        }

        System.out.println("i = " + i);

    }
}

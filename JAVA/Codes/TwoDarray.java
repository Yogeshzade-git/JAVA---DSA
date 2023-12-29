public class TwoDarray {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][5];

        // arr[2][3] = 4; // writing to the array

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = (int)(Math.random()*10); 
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //printing array in reverse order (row wise)

         for(int i=0;i<3;i++){
            for(int j=4;j>=0;j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

 
    }
}

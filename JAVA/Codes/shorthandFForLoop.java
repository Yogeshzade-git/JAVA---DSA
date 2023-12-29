public class shorthandFForLoop {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];

        // System.out.println(arr[1][2]);

        //writing 2D array with random numbers
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

            // Printing 2D array 
        for(int i=0;i<3;i++){  // for traversing the rows
            for(int j=0;j<4;j++){   // for traversing the Column   // each element of i th array
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int a[] : arr){       // advanced for loop
            for(int n : a){
                System.out.print(n + " ");
            }
            System.out.println();
            
        }

        //     for(int a[] : arr){       // advanced for loop   
        //     for(int i=0;i<a.length;i++){
        //         System.out.print(a[i]+" ");  ///  Another approach to print the 2D array
        //             }        
        //         System.out.println();
            
        // }

    }
}

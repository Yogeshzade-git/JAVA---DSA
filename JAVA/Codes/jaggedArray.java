public class jaggedArray{
    public static void main(String[] args) {
        
        int arr[][] = new int[4][];  //jagged Array        -- in this we can have arrays with different sizes --( columns )

        arr[0] = new int[3];     /// defining the size of 1st array size
        arr[1] = new int[2];
        arr[2] = new int[4];
        arr[3] = new int[1];

      for(int i=0;i<arr.length;i++){                       // inserting elements in the array  
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }
      
        for(int i=0;i<arr.length;i++){                // Printing the array elements
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");    // buy Traditional method 
            }
            System.out.println();
        }

            System.out.println();

        for(int n [] : arr){
            for(int elem : n ){                         // By Using Advanced for loop (For Each Loop)
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
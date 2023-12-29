public class ThreeDarray {
    public static void main(String[] args) {
        
        int arr[][][] = new int[3][4][5];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){                             // Inserting the elements into the 3D array
                for(int k=0;k<arr[i][j].length;k++){ 
                    arr[i][j][k] = (int)(Math.random()*100);
                }
            }
        }



        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){                        // Printing the elements From the 3D array
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }



        for(int a[][] : arr){
            for(int b[] : a){                             // printing Using the Advanced For Loop - for Each Loop 
                for(int c : b){
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}

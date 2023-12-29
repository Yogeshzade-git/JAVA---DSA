public class nestedForLoop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("DAY"+(i+1));
            for(int j=0;j<9;j++){
                System.out.println("\t" + (j+9) + " - " + (j+10));
            }
        }
    }
}

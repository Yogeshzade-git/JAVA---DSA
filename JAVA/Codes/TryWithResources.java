import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int num = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){    //The try-with-resources statement automatically closes the BufferedReader when the try block finishes
            System.out.print("Enter the Number: ");
            num = Integer.parseInt(br.readLine());
        }finally{                                       // when you uses try with Resources - its not mandatory to write finally block 
            System.out.println(num);                    // you can still run your code without finally - because we ueses finna;y block for closing the BufferReader resources and it don by TRY so chill don't compultion to mention the finally block
            System.out.println("Bye!");
        }
    }
}

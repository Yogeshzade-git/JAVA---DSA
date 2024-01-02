import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    
    public static void main(String[] args) throws NumberFormatException,IOException{
        

        int num = 0;
        BufferedReader br = null;  // declared here to make accessible from finally block also, else if its in try block it can't be accessible from finally block - no scope for finally

        try{
            // InputStreamReader in = new InputStreamReader(System.in);   you can directly pass the object in below
             br = new BufferedReader(new InputStreamReader(System.in));     // standard mostly used by many people
             System.out.println("Enter Number:");
            num = Integer.parseInt(br.readLine());
        }finally{                                             // finally block will always going to execute
            System.out.println(num);
            br.close();
            System.out.println("Thank you!! - Closing ");
        }
    }
}

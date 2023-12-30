import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaders {
    public static void main(String[] args)throws IOException {
        
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(in);

      System.out.print("Enter Number: ");
      int num = Integer.parseInt(br.readLine());
      System.out.println(num);

    }
}

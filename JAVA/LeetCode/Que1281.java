

//1281. Subtract the Product and Sum of Digits of an Integer

class Solution{
    public int subtractProductAndSum(int n){

        int product = 1;
        int sum = 0;

        while(n>0){
            int digit = n%10;
            product *= digit;
            sum += digit;
            n = n/10;
        }
      return product - sum;
    }
}

public class Que1281{
    public static void main(String[] args) {
        
        Solution s = new Solution();
        int result = s.subtractProductAndSum(4421);
        System.out.println("result: " + result);

    }
}
public class literals {
    public static void main(String[] args) {
        
        int a = 0b101;  // for binary number use ob at start
        System.out.println("Decimal of this Binary [101] is " + a);

        int b = 0x7E;  // for Hexadecimal number use ob at start
        System.out.println("Decimal of this Hexadecimal [7E] is " + b);

        int octal =  010;  // for octal number use 0 at start
        System.out.println("Decimal of this Octal [0654] is " + octal);

        int zero = 100_00_00_00; // to differentiate that helps to count no. of zeros
        System.out.println("THe number is : " + zero);  // is doesn't affect the value // the _ is get ignored 

        char ch = 'a';       // incremented the character value
        ch++;
        System.out.println(ch);

    }
}

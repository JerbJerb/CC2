package decimaltoall;

import java.util.*; 

public class DecimaltoAll {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
       
        System.out.print("Enter a Decimal number : ");
        int num = SC.nextInt();
       
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexa = Integer.toHexString(num);
       
        System.out.println("Binary value is : "+binary);
        System.out.println("Octal value is : "+octal);
        System.out.println("Hexadecimal value is : "+hexa);
    }

}
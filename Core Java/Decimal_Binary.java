import java.util.*;


public class Decimal_Binary {
    public static void decimal2Binary(int n){
        int[] arr = new int[1000];
        int i = 0 ;
        while(n > 0 ){
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }

        for(int j = i -1 ; j >= 0 ; j--){
            System.out.print(arr[j]);
        }
    }

    //Program to convert the decimal number into binary number
    public static void main(String [ ] srgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Decimal Number: ");
        int n = scan.nextInt();
        System.out.println("Decimal Number: " + n);
        System.out.print("Binary Number: ");
        decimal2Binary(n);

    }
}

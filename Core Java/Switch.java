import java.util.*;

public class Switch {
    public static void main(String[] atgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit ");
        int ch = scan.nextInt();
         System.out.println("Enter a Two Numbers :");
         int a  = scan.nextInt();
         int b = scan.nextInt();
         int c ; 
        switch(ch)
       
        {
            case 1:
            c =a + b;
            System.out.println("Addition : " + c);
            break;
             case 2:
             c = a - b;
            System.out.println("Substraction : " + c);
            break;
             case 3:
             c = a * b;
            System.out.println("Multiplication : " + c);
            break;
             case 4:
             c =a / b;
            System.out.println("Division : " + c);
            break;
            default : 
            System.out.println("Invalid Number ");
        }
    }
}

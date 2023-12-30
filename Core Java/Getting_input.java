import java.util.Scanner;
public class Getting_input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Two Numbers............");
        //int a , b , c ;
       // a = s.nextInt();
        //b = s.nextInt();
        float a  , b , c ;
        a = s.nextFloat();
        b = s.nextFloat();
        c = (a * a) + (b * b) + (2 * a * b);
        System.out.println("The Result is : " + c);
    }
}

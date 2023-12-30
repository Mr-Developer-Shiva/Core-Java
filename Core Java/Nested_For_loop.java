import java.util.*;
public class Nested_For_loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limited numbers : ");
        int n = scan.nextInt();

        for(int i = 1 ;i <= n ;i++)
        {
            for(int j = 1; j <=n ;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

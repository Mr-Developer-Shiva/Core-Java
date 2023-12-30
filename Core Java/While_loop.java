import java.util.*;

public class While_loop {
    public static void main(String[] args){
        System.out.println("Enter a limited Number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while(i <= n)
        {
            System.out.print(i + " ");
            i++;
        }
    }
}

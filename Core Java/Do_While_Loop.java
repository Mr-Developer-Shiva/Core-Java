import java.util.*;
public class Do_While_Loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limited Number : ");
        int n = scan.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i=i+2;
            
        }
        while(i <= n);
    }
}

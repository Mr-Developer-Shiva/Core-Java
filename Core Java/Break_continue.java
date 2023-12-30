import java.util.*;
public class Break_continue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limited Number : ");
        int n = scan.nextInt();
        for(int i = 1 ; i <= n; i++){
            if(i==7)
            continue;
            if(i==9)
            break;
            System.out.println(i);
        }
    }
}

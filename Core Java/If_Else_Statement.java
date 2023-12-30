import java.util.*;
public class If_Else_Statement {
    public static void main(String[] args){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        year = scan.nextInt();

        if(year%4 == 0 || (year%100 == 0 && year%400 == 0))
        {
            System.out.println("Year " + year + " is a leap year.");
        }
        else
        {
             System.out.println("Year " + year + " is Not a leap year.");
        }
    }
}

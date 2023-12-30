import java.util.*;
public class Nested_if {
    public static void main(String[] args){
        /*
         * Nested if statement
         * A company insures its drivers in a follwing case:
         * 1.If driver is married.
         * 2.If driver is unmarried , male & above 30 years of age. 
         * 3.If driver is unmarried , female & above 25 years of age. 
        */
        Scanner scan = new Scanner(System.in);
        char word;
        System.out.println("Are You Married Or Unmarried : M/U");
        word = scan.next().charAt(0);

        if(word  == 'u' || word == 'U')
        {
             System.out.println("Enter your Gender: ");
            char gender = scan.next().charAt(0);
            System.out.println("Enter in your Age: ");
            int age  = scan.nextInt();
            if(gender=='m'||gender=='M' && (age>=30))
            {
                System.out.println("You are Eligible for Insurance. ");
            }
            else if(gender == 'f' || gender == 'F' &&( age >=25))
            {
                System.out.println("You are Eligible for Insurance. ");
            }
            else
            {
                System.out.println("You are Not for Eligible for Insurance.");
            }
         
        }
        else if(word == 'm' || word == 'M')
        {
              System.out.println("You are Eligible for Insurance.");
        }
        else
        {
            System.out.println("You are Not for Eligible for Insurance.");
        }
    }
}

import java.util.*;
public class If_statement{
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age : ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        if(age >= 18 )
        {
            System.out.println("Your are Eligible for vote.....");
        }
    }
}
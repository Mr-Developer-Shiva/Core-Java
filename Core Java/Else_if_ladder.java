import java.util.*;
public class Else_if_ladder {
    public static void main(String[] args){
        Float mark;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Average Mark : ");
        mark = scan.nextFloat(); //nexInt();

        if(mark>=90 && mark<=100)
        {
            System.out.println("A - Grade");
        }
        else if(mark >= 80 && mark <= 89)
        {
            System.out.println("B - Grade");
        }
        else if(mark >= 70 && mark <= 79)
        {
            System.out.println("C - Grade");
        }
        else
        {
            System.out.println("D - Grade");
        }
    }
}

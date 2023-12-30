import java.util.*;
public class Group_Switch {
    //Group Switch
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Letter : ");
        char ch = scan.next().charAt(0);
    
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println(ch + " - it's a Vowel letter");
            break;
            default :
            System.out.println(ch + " - it's Not a Vowel Letter.");
        }
    }
}

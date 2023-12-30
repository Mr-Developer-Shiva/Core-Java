//02 Command line Arguments in JAVA
import java.lang.*;

public class Command {
    public static void main(String args[])
    {
        for(int i=0; i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}
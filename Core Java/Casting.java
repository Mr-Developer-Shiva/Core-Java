//04 Type Casting in Java
/*
        Widening Casting 
            byte -> short -> char -> int -> long  -> float -> double
        Narrowing Casting 
            double -> float -> long -> int ->char -> short -> byte 
*/
import java.lang.*;
public class Casting{
    public static void main(String[] args)
    {
        int a = 10 ;
        double b = a , d = 45.8956;
        int c = (int )d ;
        System.out.println("Integer : " + a);
        System.out.println("Double  : " + b);
        System.out.println("Double  : " + d);
        System.out.println("Integer : " + c);
    }
}
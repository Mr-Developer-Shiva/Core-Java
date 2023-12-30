class Mathematical
{
    public static int power(int base, int power){
        int result = 1;
        for(int i = 1 ; i <= power ; i++){
            result *= base;
        }
        return result;
    }   
}
public class StaticMethod {
    public static void main(String[] args){
        System.out.println("The Power is : " + Mathematical.power(2,3));
    }
}

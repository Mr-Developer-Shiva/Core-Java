public class TernaryOperator {
    public static void main(String[] args){
        int a=10 , b = 45, c ;
        c = a > b ? a : b;
        System.out.println("The Greater than value is : " + c);
        c = a < b ? a : b;
        System.out.println("The Less than value is : " + c);
    }
}

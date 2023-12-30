class Overloanding{
    public static int multiply(int a , int b){
        return a * b;
    }
     public static double multiply(double x , double y){
        return x * y;
    }
    public static double multiply(int i ,double j){
        return i * j;
    }
    public static int multiply(int r){
        return r*r;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        System.out.println("Multiply 2 Integer Values : "+ Overloanding.multiply(10, 25));
        System.out.println("Multiply 2 Double Values : "+ Overloanding.multiply(10.5, 2.5));
        System.out.println("Multiply 1 Double 1 Integer Values : "+ Overloanding.multiply(10.5, 2));
        System.out.println("Multiply 1 Integer Values : "+ Overloanding.multiply(9));
    }
}

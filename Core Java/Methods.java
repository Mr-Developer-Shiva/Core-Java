class Shiva
{   
    //No Return With Out Arguments(W/O)
    public void add(){
        int a = 123;
        int b  = 10 ;
        System.out.println("Addition : " + (a + b));
    }
     
   //No Return With  Arguments(W)
    public void sub(int a , int b){
        System.out.println("Subtraction : " + (a - b));
    }
     // Return With Out Arguments(W/O)
    public int mul(){
        int a = 123 , b =10 ;
        return a * b; 
    }
     // Return With Arguments(W)
    public float div(int x , int y ){
        return x /  y ; 
    }

    //Recursion 

    public int factorial(int n ){
        if( n == 1){
            return 1;
        }else{
            return n*factorial(n - 1);
        }

    }
}
public class Methods {
    //Type of User Defined Methods in java
    public static void main(String[] args){
        Shiva s = new Shiva();
        s.add();
        s.sub(123, 10);
        System.out.println("Multiplication : " + s.mul());
        System.out.println("Division : " + s.div( 123 , 10 ));
        System.out.println("Factorial : " + s.factorial(4));
    }
}

//Nesting of Methods in java

class Demo {
    private int m , n ;

    Demo(int a , int b){
        m = a  ;
        n = b ;
    }
    int largest(){
        if(m > n)
            return m ;
        else
            return n ;
    }

    void display(){
        int large = largest();
        System.out.println("The Largest Number is : " + large);
    }
}
public class Nested_Methods {
    public static void main(String[] args){
        Demo obj = new Demo(10, 35);
        obj.display();
    }
}

//Nested class in java
class outer{
    int a = 10 ;
    class inner{
        int b = 66;

        public void inner(){
            System.out.println("A is : " + a); 
            System.out.println("B is : " + b); 
        }
    }
    public void outer(){
        inner i = new inner();
        i.inner();
        System.out.println("B from inner class of function");
    }
}

public class Nested_class {
    public static void main(String[] args){
        outer obj = new outer();
        obj.outer();
        outer.inner obj1 = new outer() . new inner();
        obj1.inner();
    }
}

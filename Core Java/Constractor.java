class Shape{
    int length , width;

    //Create a Constractor in values Assign 
    //It's Only for public or default modifiers
    //Same class name to the method used.

    public Shape(){
        System.out.println("Constractor is Called.");
        length = 10 ;
        width = 2;
    } 
    int area(){
      int a = length * width ;
      return a ;
    }
}
public class Constractor {
    // Constractor in java   
    //  constractor default values int => 0 , String => Null ,Float => 0.0
    public static void main(String[] args){
        Shape obj = new Shape();
        System.out.println("Area of Rectangle : " + obj.area());
    }
}

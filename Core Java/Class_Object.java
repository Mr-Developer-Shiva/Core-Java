class Rectangle
{
    int length , width;
    void  getMethod(int x , int y){
        length = x ;
        width = y ;
    }

    int area(){
        int a = length * width ;
        return a;
    }
}
public class Class_Object {
    public static void main(String [] args){
        Rectangle obj = new Rectangle();
        obj.length = 10;
        obj.width = 20;
        System.out.println("Area of Rectangle: " + obj.area());

        Rectangle obj2 = new Rectangle();
        obj2.getMethod(15,10 );
        System.out.println("Area Of Rectangle: " + obj2.area());
    }
}

//hidden data getter and setter in java
class ShapeRectangle{
    private int length , width ;

    //Getter Method
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }

    //Setter Method
    void setLength(int l){
        length = l;
    }
    void setWidth(int w){
        width = w;
    }
    int area(){
        int a = length * width;
        return a;
    }
}
public class Set_Get {
    public static void main(String[ ]args){
        ShapeRectangle obj = new ShapeRectangle();
        obj.setLength(10)  ;
        obj.setWidth(15) ;
        System.out.println("Length : " + obj.getLength());
        System.out.println("Width : " + obj.getWidth ());
        System.out.println("Area of Rectangle : " + obj.area());
    }
}

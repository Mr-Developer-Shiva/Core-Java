
abstract class Shape {
    void rectangle(){
        System.out.println("Massage Form The Shape");
    }
    abstract void circle();
}

class rect extends Shape{               //Use abstract or defined the circle overriding
    void circle(){
        System.out.println("Abstract the function are overrinding");
    }
}
public class AbstractDemo {
    //abstract using in java programming...
    public static void main(String[] args){
        rect obj = new rect();
        obj.circle();
        obj.rectangle();
    }
}

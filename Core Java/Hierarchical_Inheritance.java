class shape{
        float length , breath, radius;
}

class rectangle1 extends shape{
    public rectangle1(float l , float b){
        length = l ;
        breath = b;
    }
    float rectangle_area(){
        return length * breath;
    }
}
class circle extends shape{
    public circle(float r){
        radius = r;
    }
    float circle_area(){
        return 3.14f * (radius * radius);
    }
}

class square extends shape{
    public square(float l){
        length = l;
    }
    float square_area(){
        return (length * length); 
    }
}
public class Hierarchical_Inheritance {

    //Hierarchical inheritance in java
    public static void main(String[] args){
        rectangle1 obj = new rectangle1(2, 5);
        System.out.println("Rectangle is : " + obj.rectangle_area());

        circle obj1 = new circle(5);
        System.out.println("Circle is : " + obj1.circle_area());

        square obj2 = new square(3);
        System.out.println("Square is : " + obj2.square_area());
    }
}

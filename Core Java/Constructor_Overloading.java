class Box{
    float length , width;


    //Different type of constructor is called construtor Overloading.....

    public Box()        //Default Construtor
    {
        length  = 10.8f ;
        width = 2.6f ;
    }
    public Box(int x , int y ){     //Parameterized Constructor
        length = x ;
        width = y ;
    }

    public Box(float x ){
        length = width = x ;
    }

    float area()
    {
        return length * width;
    }
}

public class Constructor_Overloading {
    // Parameterized constructor & Constructor overloading
    public static void main(String[] arrg)
    {
        Box obj1 = new Box();
        System.out.println("Rectangle : " + obj1.area());

         Box obj2 = new Box(3,8);
        System.out.println("Rectangle : " + obj2.area());

         Box obj3 = new Box(3);
        System.out.println("Rectangle : " + obj3.area());
    }
} 

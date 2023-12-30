class complex{
    private int real , img;
    public complex(){
    this.real = 5 ;
    this.img = 2;
    }

    public complex(complex obj1){
        this.real = obj1.real;
        this.img = obj1.img;
    }

    public complex(int x ,int y ){
        this.real = x ;
        this.img = y ;
    }

    public String toString(){
        return  "(" + real + " + "+ img  + "i)";
    }
}
public class Construtor_copy {

    //Copy Constructor in java
    public static void main(String []argd){
        complex obj= new complex();
        System.out.println("Object 1: " + obj.toString());

         complex obj1= new complex(3,8);
        System.out.println("Object 1: " + obj1.toString());


         complex obj3= new complex(obj1);
        System.out.println("Object 1: " + obj3.toString());
    }
}

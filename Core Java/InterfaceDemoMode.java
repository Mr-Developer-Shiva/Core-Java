interface interDemo{

    final static int A = 10 ;           //By default final static is implemented
    int B = 50 ;                        //By default final static is implemented

    public abstract void fun1();         //By default public abstract
    void fun2();                         //By default public abstract

    public static void fun3(){
        System.out.println(" Sunday ");
    }
    default void fun6(){    //create a body 
        System.out.println("Fun -6");
    }
    default void fun5(){            //default is very usefull think
        System.out.println("fun- 5");
    }
}

interface interDemo2 extends interDemo{
    void fun4();
}

class inter implements interDemo2{
    public void fun1(){
        System.out.println("Fun - 1");
    }
    public void fun2(){
    System.out.println("Fun - 2");
    }
    public void fun4(){
    System.out.println("Fun - 4");
    }
}
public class InterfaceDemoMode {
    public static void main(String[] args){
        System.out.println("A value is : " + interDemo.A);
        interDemo.fun3();
        inter obj = new inter();
        obj.fun1();
        obj.fun2();
        obj.fun4();
        obj.fun5();
        obj.fun6();

    }
}

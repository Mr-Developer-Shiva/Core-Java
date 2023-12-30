interface Animal{
    void sound();       // interface also  => public abstract <=
    void sleep();
}

class Dog implements Animal{    //implement key word
    public void sound(){        //public 
       System.out.println("Dog Sound is : bow bow"); 
    }
    public void sleep(){
        System.out.println("Dog was Sleep");
    }
}
public class InterfaceDemo {
    public static void main(String[] stgs){

    }
}

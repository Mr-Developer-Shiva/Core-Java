//static inner class 

class Outerclass {
   static int a = 10 ;        //use static key word - static 
    int b = 15 ;
    static class InnerClass
    {
        public void display()
        {
            System.out.println("A is :" + a);
        }
    }
}
public class Static_inner_Class {
    public static void main(String [ ]argd){
        Outerclass.InnerClass obj = new Outerclass. InnerClass();
        obj.display();
    }
}

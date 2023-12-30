//Java using Final Methods.........
class Super{
    public void display(){
        System.out.println("I am Super Display");
    }
    final void SuperDisplay(){
        System.out.print("I am Super Final Display");
    }
}
class sub extends Super{
    public void display(){
        System.out.println("I am Sub Display");
    }
    // Not final to use the overriding the method 
}
public class FinalMethods {
    public static void main(String[] args){
        sub obj = new sub();
        obj.display();
       obj.SuperDisplay();
    }
}

abstract class testDemo{
    abstract void display();
}

class outerDemo{
    public void outerDisplay(){
    testDemo obj = new testDemo(){
        public void display(){
            System.out.println("Test Display");
        }
        
    };
    obj.display();
}
}
public class AnonymousInner {
    public static void main(String [] args){
        outerDemo o = new outerDemo();
        o.outerDisplay();
    }
}

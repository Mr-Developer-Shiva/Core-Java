//Example for abstract class in java programming...........
abstract class Mobile{
    void voicecall(){
        System.out.println("Call the Passenger");
    }
    abstract void camera();
    abstract void touchDisplay();
}

class Samsung extends Mobile{
    void camera(){
        System.out.println("The Camera 250MPX ");
    }
    void touchDisplay(){
        System.out.println("The 5.5 Inches Display");
    }
}
class Nokia extends Mobile{
    void camera(){
        System.out.println("The Camera 200MPX ");
    }
    void touchDisplay(){
        System.out.println("The 5 Inches Display");
    }
    void FingerPrint(){
        System.out.println("Including by a Finger Print");
    }
}
public class AbstractDemo2 {
    public static void main(String[] argds){
        Samsung SM = new Samsung();
        SM.camera();
        SM.voicecall();
        SM.touchDisplay();
System.out.println("-------------------------------");
        Nokia Ni = new Nokia();
        Ni.voicecall();
        Ni.camera();
        Ni.FingerPrint();
        Ni.touchDisplay();
    } 
}

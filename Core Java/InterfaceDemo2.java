// How Multiple inheritance can be achieved by implement multiple interfaces
class Phone {
    void voicecall(){
        System.out.println("Voice call Allowed");
    }
    void sms(){
        System.out.println("Send From a Message");
    }
}
interface camera{
    void pixel();
    void lens();
}
interface music{
    void player();
    void pause();
    void stop();
}
class smartphone extends Phone implements music , camera{
        public void pixel(){
            System.out.println("The 128 MG Pixels");
        }
        public void lens(){
            System.out.println("The take away the 3 lenses");
        }
        public void player(){
            System.out.println("Music Play");
        }
        public void pause(){
            System.out.println("Music Pause");
        }
        public void stop(){
            System.out.println("Music Stop");
        }
    }
public class InterfaceDemo2 {
    public static void main(String[] args){
        smartphone obj = new smartphone();
        obj.sms();
        obj.voicecall();
        obj.player();
        obj.stop();
        obj.pause();
        obj.lens();
        obj.pixel();

    }
}

//Enumeration in java
 

public class EnumDemo {
    enum demo{
        LOW,MEDIUM,HIGH;
    }
    public static void main(String[] argss){
        demo obj =demo.HIGH;
        System.out.println(obj);

        switch(obj){
            case LOW:
            System.out.println("Low Level");
            break;
             case MEDIUM:
            System.out.println("Medium Level");
            break;
             case HIGH:
            System.out.println("High Level");
            break;
        }

        for (demo level : demo.values()){
            System.out.println(level);
        }
    }
}

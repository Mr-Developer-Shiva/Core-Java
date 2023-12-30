//Singleton class in java  
class ABC{
    static ABC obj = null;
    private ABC(){  }
    public static ABC getInter(){
        if(obj == null){
            obj = new ABC();
        }
        return obj;
    }
    public void display(){
        System.out.println("I am Display");
    }
}
public class Singleton_class {
    public static void main(String[] args){
        ABC obj = ABC.getInter();
        obj.display();
    }
}

class GrandFather{
    public void house(){
        System.out.println("Have Own Buying a House");
    }
}
class father extends GrandFather{
    public void car(){
        System.out.println("Have Own Buying a Car");
    }
}
class Child extends father{
    public void bike(){
        System.out.println("Have Own Buying a Bike");
    }
}
public class Multilevel_Inheritance {
    //Multilevel inheritance in java
    public static void main(String[] args){
        Child obj = new Child();
        obj.house();
        obj.car();
        obj.bike();
    }
}

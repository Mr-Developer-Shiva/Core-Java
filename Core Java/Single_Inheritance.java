class Father {
    public void house(){    //base class 
        System.out.println("Have Own buy a House");
    }
}

class Son extends Father{       //derived class
    public void car(){
        System.out.println("Have Own buy a Car");
    } 
}

public class Single_Inheritance {
    //Single inheritance in java
    public static void main(String []args){
        Son obj = new Son();
        obj.car();
        obj.house();
    }
}

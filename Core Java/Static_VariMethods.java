class staticTest{
    static int a = 100;            
    int b = 50 ; 

    void show(){
        System.out.println("A : " + a + " B : " + b);
    }
    static void display(){
        System.out.println("A is : " + a );    // static use keyword,only - a...is 
    }

}
public class Static_VariMethods {
    public static void main(String[] args){
        staticTest obj  = new staticTest();
        obj.show();
        staticTest obj1 = new staticTest();     
        obj1.b = 30;
        staticTest.a = 200;         // static is common for all
        obj1.show();
        obj.show();
    }
}

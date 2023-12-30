class Finals{
    final int Min = 10;
    final int Medium ;
    final int Max;

    Finals(int medium,int max){
        Medium = medium;
        Max = max;
    }
    void display(){
        System.out.println("Minimum : " + Min);
        System.out.println("Medium  : " + Medium);
        System.out.println("MAX     : " + Max);
    }
}
public class Final_Variable {
    public static void main(String[] arfs){
        Finals obj = new Finals(100, 1000);
        obj.display();
    }
}

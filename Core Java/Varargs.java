
public class Varargs {
    public static void getNames(String... name){
        for(String names : name){
            System.out.println(names);
        }
    }
    public static void main(String[] args){
        getNames("Shiva","Ram","Murugan","Ranjini","Subu lakshmi");
    }
}

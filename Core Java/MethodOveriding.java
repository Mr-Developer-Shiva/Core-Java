class user{
    String name ;
    int age ;

    user(String n,int a){
        this.name = n;
        this.age = a;
    }

    public void display(){
        System.out.println("The User name is : "+ name);
        System.out.println("The User age  is : "+ age);
    }

}

class MainProgrammer extends user{
        String companyName;
        MainProgrammer(String n , int a , String c){
        super(n,a);
        this.companyName = c ;
        }
    
        public void display(){
        System.out.println("The User name is : "+ name);
        System.out.println("The User age  is : "+ age);
        System.out.println("The Company Name is : "+ companyName);
    }
}

public class MethodOveriding {
    public static void main(String args[]){
       MainProgrammer obj = new MainProgrammer("SHIVA", 21, "Ray");
       obj.display();
    }
}

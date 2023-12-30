class outercls{
    void display(){
        class innercls{
            public void innerdisplay(){
                System.out.println("Inner Class");
            }  
        }
        innercls inner = new innercls();
        inner.innerdisplay();
    }
}
public class Local_Inner_class {
    public static void main(String[] args){
        outercls obj = new outercls();
        obj.display();
    }
}

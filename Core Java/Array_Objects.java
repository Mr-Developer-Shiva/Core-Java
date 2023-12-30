//Array of Object in java
class Student{
    public int roll_No;
    public String name ;
    Student(int roll_No , String name){
        this.roll_No = roll_No;
        this.name = name;
    }
    void print()
    {
        System.out.println("Student Name is        : "+ name);
        System.out.println("Student Roll Number is : "+ roll_No);
        System.out.println("--------------------------------");
    }

}
public class Array_Objects {
    public static void main(String [] argd){
       /* Student obj = new Student(10,"Shiva");
        obj.print();
         Student obj1 = new Student(7,"Sathya");
        obj1.print();*/
        Student[] obj =  new Student[5];
        obj[0] = new Student(10, "Shiva");     
        obj[1] = new Student(20, "Vincy");     
        obj[2] = new Student(30, "Maari");     
        obj[3] = new Student(40, "Prema");     
        obj[4] = new Student(50, "Kaali");     

        for(int i = 0 ; i<obj.length ;i++ ){
            obj[i].print();
        }
    }
}

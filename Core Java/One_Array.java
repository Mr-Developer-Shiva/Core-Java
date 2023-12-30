import java.util.*;
public class One_Array {
    // Arrays in java
    public static void main(String[] argd){
       
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        //Accessing Elements in Array
        System.out.println(arr[0]);

        //Print all element using for loop
       /*  for(int i = 0 ; i <= arr.length ;i++ ){
            System.out.println(arr[i]);
        }*/

        //Print all element using Enhanced for loop
        for(int element : arr)
        {
            System.out.println(element);
        }
         
        int a[] ;           //Declaring array
        a = new int[5];     //Allowcating Memory to array
        for(int value : a){     
            System.out.println(a[value]);
        }
        int[] c = new int[10];      //Compination Both statement

        for(int i = 0 ;i<10 ; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            c[i] = scan.nextInt();
           
        }

        for(int number : c){
            System.out.println(" The Number are : " +number);
            
        }

    }
}

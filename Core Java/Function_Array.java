import java.util.*;

public class Function_Array {
    //Retrun array form Method..............
    public static int[] sendArray(){
        //Returning array
        return new int[]{1,2,3,4,5};
    }

    public static int[] sortArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limited Number : ");
        int n = scan.nextInt();
       
        int[] a = new int[n]; 
        for(int i = 1 ;i <= n;i++ ){
            System.out.println("Enter a Limited Number " + i + " : ");
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);

        return a;

    }
    public static void main(String[ ]arg){
       /*  int arr[] = sendArray();
        for(int a : arr){
            System.out.println(a);
        }*/
        
        int [] arr = sortArray();
        for (int a : arr ){
            System.out.println(a);
        }
    }
}

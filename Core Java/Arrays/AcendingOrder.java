
import java.util.Arrays;
public class AcendingOrder {
    public static void main(String[] args){
        int[] a = new int[]{10,4,67,43,786,3,53};
        System.out.println("Before sorting: " + Arrays.toString(a));
       /*  for(int values : a)
        {
            System.out.println(values);
        }*/
        int temp;
        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = i+1 ; j<a.length ;j++)
            {
            if(a[i] > a[j])      //decending Order using less than < 
            {
                temp= a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            }
        }
        System.out.println("After sorting : " + Arrays.toString(a));

        
    }
}

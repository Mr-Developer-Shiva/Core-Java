
import java.util.Arrays;
public class Insert_Array_Element {
    public static void main(String[] args){
        // program to insert a element in specific index of an array......
        int[] a = {10,20,30,40,50,60,70,80,90,100};
        int index = 0;
        int value = 123;
        for(int i = a.length-1; i >index ;i--)
        {
            a[i]=a[i-1];
        }
        a[index] = value;
        System.out.println("The A of Length is: " + Arrays.toString(a));
    }
}

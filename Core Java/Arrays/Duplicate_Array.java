import java.util.*;
public class Duplicate_Array{
    public static void main(String[] args){
        //Write a program to print the duplicate element in array

        int[] a ={1,7,5,9,6,1,9,5,0,2,2};

        for(int i =0 ;i <a.length - 1 ; i++){
            for(int j = i+1 ; j<a.length;j++){
                if(a[i] == a[j] && (i!=j))
                {
                    System.out.println("The Duplicate Value: " + a[i]);
                }
            }
        }

    }
}
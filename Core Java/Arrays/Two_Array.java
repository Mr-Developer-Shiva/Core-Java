public class Two_Array {
    public static void main(String [] arr){
        //Two Daimensional Array................
        int[][] a = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int i = 0;i<a.length;i++){
            for(int j = 0 ; j<a.length ;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

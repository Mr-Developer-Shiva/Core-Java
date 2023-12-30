public class Jagged_Array {
    public static void main(String[] arr){
        // Jagged array in java Program...........
        int [][] a = {
                    {10,20,30,40},  //4
                    {10,20,30},     //3
                    {50,60,70,80}   //4
        };
        for(int i = 0 ; i < 3;i++){
            for(int j = 0 ; j <a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        //Using Enhanced for loop
        for(int k[] : a){
            for(int l : k){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}

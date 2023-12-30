public class Binary_to_Decimal {
    public static int bin2dec (int binary){
        int decimal = 0 , power = 0 ;
        while(binary != 0)    //1100 110 11 1 
        {   
            int remainder = binary % 10;    // 0 0 1 1 
            decimal +=  remainder * Math.pow(2,power);  // 4 + 8 
            binary = binary /10;    //110 11 1  
            power++;    // 1 2 3  
        }
        return decimal;
    }
    //Program to convert birary number into Decimal Number.
    public static void main(String[] args){
        System.out.println("Decimal : " + bin2dec(1100));
    }
}

public class Unary {
    public static void main(String[] args){
        // Unary Operators in java ++ --;
        int a = 10 , b = 50;
       // a++;
        System.out.println(a++);
        //b++
        System.out.println(b++);

        int x = 9 , y = 7 , z = 90;
        System.out.println(z++ + ++x + y + ++x + y++ + --y + x );
    }
}

class BlockTest{
     static {
        System.out.println("Block Test - 1");
    }
     static {
        System.out.println("Block Test - 2");
    }
}
public class Static_Block {
    static {
        System.out.println("Block - 1");
    }
    public static void main(String[] argd){
        BlockTest obj  =  new BlockTest();
        System.out.println("Main");
    }
     static {
        System.out.println("Block - 2");
    }
}

public class StringBuffer_StringBuilder {
    public static void main(String[] arrr){
        // String Buffer & String Builder 
        //Safe Threading => Buffer
        // Not (!) --> Safe Threading => Builder

       // StringBuffer str = new StringBuffer("Shiva");         //imotable
       StringBuilder str = new StringBuilder("Shiva");
        System.out.println(str);
        str.append("Kumar");
        System.out.println(str);
        str.insert(10," SoftWare Developer");
        System.out.println(str);
        str.replace(5, 10, "Kishna");
        System.out.println(str);
        str.delete(5,11);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));

        System.out.println(str.substring(2));
        System.out.println(str.substring(12,15));
        str.setCharAt(0,'@');
        System.out.println(str);
        str.reverse();
        System.out.println(str);
       
       StringBuffer sb = new StringBuffer();
       System.out.println(sb.capacity());
       sb.append("Hello");
       System.out.println(sb.capacity());
       sb.append("Java is myFavorite language");
       System.out.println(sb.capacity());
    }
}

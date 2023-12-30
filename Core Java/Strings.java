public class Strings {
    public static void main(String[] args){
        //String in java

        //this is a string litrals  no changed and 
        //String constant pool 
        //Stored based on value => "Shiva kumar"
        String a = "Shiva Kumar";
        String b = "Shiva Kumar";

        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("Hash Code : " + a.hashCode());
        System.out.println("Hash Code : " + b.hashCode());
        System.out.println("Length : " + a.length());
        System.out.println("Character Value : " + b.charAt(0));
        System.out.println("Equal : " + a.equals(b));
        System.out.println("Equal Ignore Cases : " + a.equalsIgnoreCase(b));
        System.out.println("Upper Cases : " + a.toUpperCase());
        System.out.println("Lower Cases : " + a.toLowerCase());
        System.out.println("Empty String : " + a.isEmpty());
        System.out.println("Contains String : " + a.contains("Shiva"));
        System.out.println("Contains String : " + a.contains("vincy"));
        System.out.println("Replace : " + a.replace("Kumar","Raju"));
        System.out.println("Starts With : " + a.startsWith("Sh"));
        System.out.println("Ends With : " + a.endsWith("mar"));
        System.out.println("Sub String Start : " + a.substring(5));
        System.out.println("Sub String Start & End : " + a.substring(0,5));
        char[] ch =  a.toCharArray();
        for(char x :ch){
            System.out.print(" " + x);
        }

        String c = " hello ";   //With spaces..........
        System.out.println("\nWord is :" + c);
        System.out.println(c.length()); //7
        System.out.println("Word is :" + c.trim());     //Without Spaces............
        System.out.println(c.trim().length());  //chain function or method.........................;
        
    }
}

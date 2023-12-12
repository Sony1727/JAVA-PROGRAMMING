public class Main
{
 public static void main(String args[])
 {
    String name="Sony";
    int length=name.length();
    System.out.println(" length of my name :"+length);
 
     //concatination
     
     String h="Hello";
     String w="world";
     String message=h.concat(w);
     System.out.println(message);
     
     //character to String
     
     char[] demo={'f','i','s','h'};
     String s=new String(demo);
     System.out.println(s);
     //check equality
     
     String version="2.3";
     if(version.equals("2.3"))
     {
         System.out.println("ANDROID IS GINGERBREAD :");
     }
     else{
         System.out.println("ANDROID NOT FOUND HERE :");
     }
 }
 
}

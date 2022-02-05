import java.util.*;
public class SBuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Siddhesh");
     //   System.out.println(sb);
      //  System.out.println(sb.charAt(1));
      //  sb.setCharAt(1,'I');
      //  System.out.println(sb);
      //  sb.insert(2,'D');
      //  System.out.println(sb);
      //  sb.delete(2, 3);
       // System.out.println(sb);
       // sb.append(" Agnihotri");
       // System.out.println(sb);

       for(int i=0;i<sb.length()/2;i++) {
           int front=i;
           int back=sb.length() -1-i; // 8-1-0

           char frontchar=sb.charAt(front);
           char backchar=sb.charAt(back);

           sb.setCharAt(front,backchar);
           sb.setCharAt(back,frontchar);
       }
            System.out.println(sb);
       
    }
}
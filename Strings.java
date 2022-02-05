import java.util.*;
class Strings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();

        String fullname=name1 + "&" + name2;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        if(name1.compareTo(name2)==0) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }
       String count= fullname.substring(3,8);
       System.out.println(count);
    }
}
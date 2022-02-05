import java.util.*;
class InputArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
        int total[]=new int[size];
        for(int i=0;i<size;i++){
            total[i]=sc.nextInt();
        }
            int s=sc.nextInt();
            for(int i=0;i<total.length;i++){
                if(total[i]==s){
                    System.out.println("S found at:::" +i);
                }
            }
        

    }
}
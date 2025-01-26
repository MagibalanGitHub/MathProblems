import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int original=a;
         int res=0;
         int count=0;

         while(a>0){
             int r=a%10;
             a/=10;
             count++;
         }
         int no=original;
         while(no>0){
             int res1=no%10;
             res+=Math.pow(res1,count);
             no/=10;

         }


         if(original==res){
             System.out.println("Armstrong Number");
         }
         else{
             System.out.println("Not armstrong number");
         }
    }
}

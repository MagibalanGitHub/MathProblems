import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int x=a;
        int res=0;
        while(a>0){
            int r=a%10;
            res+=r;
            a/=10;
        }
        if(x%res==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int res=0;
        boolean rem=true;
        do{
            int r=a%10;
            int x=r*r;
            res+=x;
            a/=10;


        }while(a>0);
        
        System.out.println(res);
    }
}

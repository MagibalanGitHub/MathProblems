import java.util.Scanner;

public class Friendly {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                sum2+=i;
            }
        }
        if(a/sum1 ==b/sum2){
            System.out.println("Friendly Number");
        }
        else{
            System.out.println(" Not a friendly Number");
        }
    }
}

import java.util.Scanner;

public class Amastrong {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int s=a*a;
        int flag=1;
        while(a>0){
            if(a%10!=s%10){
                flag=0;
                System.out.println("Not");
                break;
            }
            a/=10;
            s/=10;
        }
        if(flag==1){
            System.out.println("Correct");
        }
    }
}

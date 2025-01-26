import java.util.Scanner;

public class Drona {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        int a;

        int sum=0;
        int count=0;
        while(sum<t){
            a=in.nextInt();
            sum+=a;
            count++;
        }
        System.out.println(count);


    }
}

import java.util.Scanner;

public class Abudant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);

        if(sum>a){
            System.out.println("Abudant Number");
        }
        else{
            System.out.println("Not Abudant Number");
        }
    }
}

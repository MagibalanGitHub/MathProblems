import java.util.Scanner;

public class PrimeIn {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of prime numbers You want");
        int n=scanner.nextInt();

        int num=2;
        int count=0;
        while(count<n){
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }


            }
            if(isprime){
                System.out.println(" The prime numbers are : "+num);
                count++;
            }
          num++;
        }
    }
}

import java.util.Scanner;

public class Hello {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int first=0;
        int second =1;

        for(int i=1;i<=a;i++){
            System.out.println(first +" ");
            int next=first+second;
            first=second;
            second=next;
        }

    }
}

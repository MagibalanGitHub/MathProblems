import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char []arr=s.toCharArray();
        int sum=0;
        for(char z:arr){
            if(Character.isDigit(z)) {
                int a = Integer.parseInt(String.valueOf(z));
                sum += a;
            }
            else if(Character.isLetter(z)){
                System.out.println("Enter a valid input");
                return;
            }
        }
        System.out.println("The Sum is : "+sum);


        String a=scanner.nextLine();
        String []arr1=a.split("[, ]+");
        int sum1=0;
        for(String a1:arr1){
            sum1+=Integer.parseInt(a1);
        }
        System.out.println("SUM "+sum1);
    }

}


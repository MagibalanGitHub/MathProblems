import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String a = scanner.nextLine();

        char[]arr=a.toCharArray();
        boolean ispalindrome=true;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                ispalindrome=false;
                break;
            }
        }

        if(ispalindrome){
            System.out.println(" Palindrome ");
        }
        else{
            System.out.println(" Not palindrome ");
        }
    }

}

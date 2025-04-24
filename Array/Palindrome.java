import java.util.Scanner;
public class Palindrome{
    public static boolean checkpalindrome(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(checkpalindrome(arr)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
}

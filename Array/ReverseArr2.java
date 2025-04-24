import java.util.Scanner;

public class ReverseArr2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i: arr){
            System.out.print(i +" ");
        }
        int left=0;
        int right=n-left-1;
        int temp;
        while(left<right){
            temp =arr[left] ;
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println();
        System.out.println("Reversed");
        for(int k: arr){
            System.out.print(k +" ");
        }
    }
}

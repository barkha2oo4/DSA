import java.util.*;
public class ReverseArr1{
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
        int j = 0;
        while (j < n / 2) {
            int temp = arr[j];
            arr[j] = arr[n - j - 1];
            arr[n - j - 1] = temp;
            j++;
        }
        System.out.println();
        System.out.println("reversed");
        for(int k: arr){
            System.out.print(k +" ");
        }
    }
}

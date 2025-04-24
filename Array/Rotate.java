import java.util.*;
public class Rotate {
    public static void lrotate(int[] arr){
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
    public static void Rrotate(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-2;i>=1;i--){
            arr[i] =arr[i-1];
        }
        arr[0]=temp;
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Left Rotate");
        lrotate(arr);
        System.out.println("Right Rotate");
        Rrotate(arr);
    }
}

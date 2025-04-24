import java.util.*;
public class OpRotate {
    public static void lrotate(int[] arr,int k){
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]= arr[i];
        }
        int n=arr.length;
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
    public static void Rrotate(int[] arr,int k){
        int n=arr.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]= arr[i];
        }
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
        System.out.print("Rotate by: ");
        int k=sc.nextInt();
        System.out.println("Left Rotate");
        lrotate(arr,k);
        System.out.println("Right Rotate");
        Rrotate(arr,k);
    }
}

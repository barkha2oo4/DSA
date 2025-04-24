import java.util.*;
public class InsertAtP {
    public static void InsertAtpos(int[] arr,int n,int pos,int element){
        for(int i=n-1;i>=pos;i--){
            arr[i] =arr[i-1];
        }
        arr[pos] =element;
        for(int j: arr){
            System.out.print(j+ " ");
        }

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n+2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos= sc.nextInt();
        int element=sc.nextInt();
        InsertAtpos(arr,n,pos,element);
    }
    
}

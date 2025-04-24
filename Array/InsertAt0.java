import java.util.Scanner;
public class InsertAt0{
    public static void InsertAtStart(int[] arr,int element){
        int temp=arr[0];
        for(int i=arr.length-2;i>0;i--){
            arr[i]=arr[i+1];
        }
        arr[0]=element;
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n+2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        InsertAtStart(arr,element);
    }

}

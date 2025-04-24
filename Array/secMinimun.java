import java.util.Scanner;
public class secMinimun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sec_smallest = Integer.MAX_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                sec_smallest=smallest;
                smallest=arr[i];
            }
            if(arr[i]<sec_smallest && arr[i]!=smallest){
                sec_smallest=arr[i];
            }
        }
        System.out.println(sec_smallest);
    }
}

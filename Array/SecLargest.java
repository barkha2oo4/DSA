import java.util.Scanner;
class SecLargest{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sec_largest = Integer.MIN_VALUE;
        int largest= Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]> largest){
                third_largest =sec_largest;
                sec_largest=largest;
                largest =arr[i];
            }
            if(arr[i]>sec_largest && arr[i]!=largest){
                sec_largest=arr[i];
            }
            if(arr[i]>third_largest && arr[i]!=sec_largest && arr[i]!=largest){
                third_largest=arr[i];
            }
        }
        System.out.println("Second largest: "+ sec_largest);
        System.out.println("Third largest: "+ third_largest);
    }
}

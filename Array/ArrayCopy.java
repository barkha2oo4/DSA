public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2= new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        for(int j: arr2){
            System.out.print(java+" ");
        }
    }
}

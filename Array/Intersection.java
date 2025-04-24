import java.util.*;

public class Intersection {
    public static int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);  // Ensure both arrays are sorted
        Arrays.sort(arr2);

        int n = arr1.length, m = arr2.length;
        int[] temp = new int[Math.min(n, m)];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                // Avoid duplicates in result
                if (k == 0 || temp[k - 1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Copy result to exact-sized array
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] inter = intersection(arr1, arr2);
        for (int val : inter) {
            System.out.print(val + " ");
        }
    }
}

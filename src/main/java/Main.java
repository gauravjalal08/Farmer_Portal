 
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    
    public static void GCDSorting(int N, int K, int[] A) {
        // Calculate GCD of each element with K, divide each element, and store in new array
        int[] newArr = new int[N];
        for (int i = 0; i < N; i++) {
            int gcd = gcd(A[i], K);
            newArr[i] = A[i] / gcd;
        }
        
        // Sort the new array
        Arrays.sort(newArr);
        
        // Print the space-separated elements of the new sorted array
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
    
    // Function to calculate GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        GCDSorting(N, K, A);
    }
}

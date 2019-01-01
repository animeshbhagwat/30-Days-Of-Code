//Day 7: Arrays
import java.util.Scanner;

public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        for (int i = n-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
}

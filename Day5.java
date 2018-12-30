//Day 5: Loops
import java.util.Scanner;

class Day5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+s(n*i));
        }  
        scanner.close();
    }
}

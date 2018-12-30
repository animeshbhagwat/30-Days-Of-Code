//Day 2: Operators
import java.util.*;
public class Day2 {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double cost = meal_cost + meal_cost * tip_percent / 100.0 + meal_cost * tax_percent / 100.0;
        System.out.println((int)(cost+0.5));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

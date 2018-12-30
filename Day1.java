//Day 1: Data Types
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int iInput = scan.nextInt();
        double dInput = scan.nextDouble();
        scan.nextLine(); //remove enter key (/n) from earlier input from input buffer 
        String sInput = scan.nextLine();
        System.out.println(i + iInput);
        System.out.printf("%.1f \n",d + dInput);
        System.out.println(s + sInput);

        scan.close();
    }
}
//Day 6: Let's Review
import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++) {
            String s = sc.next();
            String even="";
            String odd="";
            for (int j=0;j<s.length();j++) {
                if (j%2==0) {
                    even+=s.charAt(j);
                } else {
                    odd+=s.charAt(j);
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}


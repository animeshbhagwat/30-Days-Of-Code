//Day 26: Nested Logic
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //actual return date
        int dayA = sc.nextInt();
        int monthA = sc.nextInt();
        int yearA = sc.nextInt();
        //expected return date
        int dayE = sc.nextInt();
        int monthE = sc.nextInt();
        int yearE = sc.nextInt();

        Date expected = new Date(yearE, monthE, dayE);
        Date actual = new Date(yearA, monthA, dayA);
        
        int fine;
        if(actual.compareTo(expected)<=0) {
            fine = 0;
        } else if(monthA==monthE && yearA==yearE) {
            fine = 15*(dayA-dayE);
        } else if(yearA==yearE) {
            fine = 500*(monthA-monthE);
        } else {
            fine = 10000;
        }
        System.out.println(fine);
        sc.close();
    }
}
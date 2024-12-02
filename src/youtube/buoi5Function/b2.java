package youtube.buoi5Function;

import java.util.Scanner;

public class b2 {
    public static boolean soCP(long n) {
        if (n < 1) {
            return false;
        }
        long sqrt = (long) Math.sqrt(n);
        return sqrt * sqrt == n;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n:");
        int n = sc.nextInt();
        if(soCP(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

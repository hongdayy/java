package youtube.buoi2IfElse;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long result =  a * (b + c) +  b * (a + c);
        System.out.println(result);
    }
}

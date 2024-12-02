package youtube.buoi2IfElse;

import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        long tich = (long)a * b;
        double thuong = (double)a / b;

        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);
        if(b == 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.4f", thuong);
        }
    }
}

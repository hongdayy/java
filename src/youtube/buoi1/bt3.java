package youtube.buoi1;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t = sc.nextInt();

        int tong = x + y + z + t;
        int kq = x - y + z * t;


        System.out.println(x + "," + y + "," + z + "," + t);
        System.out.println(tong);
        System.out.println(kq);
    }
}

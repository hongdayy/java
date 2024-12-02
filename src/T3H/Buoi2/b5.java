package T3H.Buoi2;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int a = sc.nextInt();
        System.out.println("Nhập tháng: ");
        int b = sc.nextInt();

        if(a < 1 || b > 12) {
            System.out.println("Không hợp lệ");
        } else {
            int days;
            if(a == 2) {
                if(namnhuan(a)) {
                    days = 29;
                } else  {
                    days = 28;
                }
            } else if (a == 1 || a == 3 ||a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
                days = 31;
            } else {
                days = 30;
            }
            System.out.printf("Tháng %d năm %d có %d ngày\n", b, a, days);

        }
    }
    public static boolean namnhuan(int a) {
        return (a % 4 == 0  && a % 100 == 0) || (a % 400 == 0);
    }
}

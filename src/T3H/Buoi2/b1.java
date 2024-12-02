package T3H.Buoi2;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm chuyên cần:");
        int diemCC = sc.nextInt();
        System.out.println("Điểm giữa kì:");
        int diemGK = sc.nextInt();
        System.out.println("Điểm cuối kì:");
        int diemCK = sc.nextInt();
        double diemTB = (diemCC + diemGK + diemCK) / 3;
        System.out.println("Điểm TB " + diemTB);

        if(diemTB >= 9) {
            System.out.println("Loại A");
        } else if (diemTB >= 7 && diemTB < 9) {
            System.out.println("Loại B");

        } else if (diemTB >= 5 && diemTB < 7) {
            System.out.println("Loại C");
        }else {
            System.out.println("Loại D");
    }


    }
}

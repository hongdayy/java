package Buoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int thang = scanner.nextInt();

        int soNgay = tinhSoNgayTrongThang(nam, thang);

        if (soNgay != -1) {
            System.out.printf("Thang %d nam %d co %d ngay.\n", thang, nam, soNgay);
        } else {
            System.out.println("Tháng nhập k đúng.");
        }
    }

    public static int tinhSoNgayTrongThang(int nam, int thang) {
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:

                if (kiemTraNamNhuan(nam)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Tháng không hợp lệ
        }
    }

    public static boolean kiemTraNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
}

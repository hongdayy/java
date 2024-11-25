package Buoi2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu();
            System.out.print("Chọn 1 trong 4 cái: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tinhDiemSinhVien();
                    break;
                case 2:
                    kiemTraLoaiTamGiac();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn không đúng");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void menu() {
        System.out.println("+-----------------------------+");
        System.out.println("|            MENU             |");
        System.out.println("+-----------------------------+");
        System.out.println("| điểm sinh viên      |");
        System.out.println("| loại tam giác   |");
        System.out.println("| tiền điện           |");
        System.out.println("| Kết thúc                 |");
        System.out.println("+-----------------------------+");
    }

    public static void tinhDiemSinhVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("điểm chuyên cần: ");
        double diemChuyenCan = scanner.nextDouble();

        System.out.print("điểm giữa kỳ: ");
        double diemGiuaKy = scanner.nextDouble();

        System.out.print("điểm cuối kỳ: ");
        double diemCuoiKy = scanner.nextDouble();

        double diemTrungBinh = (diemChuyenCan * 0.2) + (diemGiuaKy * 0.3) + (diemCuoiKy * 0.5);
        System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);

        char xepLoai;
        if (diemTrungBinh >= 9) {
            xepLoai = 'A';
        } else if (diemTrungBinh >= 7) {
            xepLoai = 'B';
        } else if (diemTrungBinh >= 5) {
            xepLoai = 'C';
        } else {
            xepLoai = 'D';
        }

        System.out.println("Xếp loại: " + xepLoai);
    }

    public static void kiemTraLoaiTamGiac() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("cạnh c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác cân.");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Không phải tam giác.");
        }
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện: ");
        int soDien = scanner.nextInt();

        double tongTien = 0;

        if (soDien <= 50) {
            tongTien = soDien * 1.678;
        } else if (soDien <= 100) {
            tongTien = 50 * 1.678 + (soDien - 50) * 1.734;
        } else if (soDien <= 200) {
            tongTien = 50 * 1.678 + 50 * 1.734 + (soDien - 100) * 2.014;
        } else if (soDien <= 300) {
            tongTien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (soDien - 200) * 2.536;
        } else if (soDien <= 400) {
            tongTien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (soDien - 300) * 2.834;
        } else {
            tongTien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (soDien - 400) * 2.927;
        }

        System.out.printf("Tổng tiền điện phải trả: %.2f VND\n", tongTien);
    }
}

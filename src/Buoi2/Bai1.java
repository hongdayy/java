package Buoi2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm chuyên cần: ");
        double diemChuyenCan = scanner.nextDouble();

        System.out.print("Nhập điểm giữa kỳ: ");
        double diemGiuaKy = scanner.nextDouble();

        System.out.print("Nhập điểm cuối kỳ: ");
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
        scanner.close();
    }
}

package Buoi2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện: ");
        int soDien = scanner.nextInt();

        double soTien = 0;

        if (soDien <= 50) {
            soTien = soDien * 1.678;
        } else if (soDien <= 100) {
            soTien = 50 * 1.678 + (soDien - 50) * 1.734;
        } else if (soDien <= 200) {
            soTien = 50 * 1.678 + 50 * 1.734 + (soDien - 100) * 2.014;
        } else if (soDien <= 300) {
            soTien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (soDien - 200) * 2.536;
        } else if (soDien <= 400) {
            soTien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (soDien - 300) * 2.834;
        } else {
            soTien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (soDien - 400) * 2.927;
        }

        System.out.printf("Tổng tiền điện phải trả: %.2f VND\n", soTien);
        scanner.close();
    }
}

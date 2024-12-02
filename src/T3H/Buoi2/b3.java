package T3H.Buoi2;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng (kWh): ");
        int kWh = scanner.nextInt();


        if (kWh < 0) {
            System.out.println("Số điện sử dụng phải là số không âm.");
        } else {

            double totalCost = 0;
            if (kWh <= 50) {
                totalCost = kWh * 1.678;
            } else if (kWh <= 100) {
                totalCost = 50 * 1.678 + (kWh - 50) * 1.734;
            } else if (kWh <= 200) {
                totalCost = 50 * 1.678 + 50 * 1.734 + (kWh - 100) * 2.014;
            } else if (kWh <= 300) {
                totalCost = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (kWh - 200) * 2.536;
            } else if (kWh <= 400) {
                totalCost = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (kWh - 300) * 2.834;
            } else {
                totalCost = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (kWh - 400) * 2.927;
            }


            System.out.printf("Tổng tiền điện phải trả: %.2f VNĐ\n", totalCost);
        }


        scanner.close();
    }
}

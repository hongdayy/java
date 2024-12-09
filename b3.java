package T3H.Buoi6;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo 10 tài khoản
        b2[] accounts = new b2[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new b2(i, 100, 0); // ID từ 0 đến 9, số dư ban đầu là 100
        }

        while (true) {
            // Yêu cầu người dùng nhập ID tài khoản
            System.out.print("Nhập ID tài khoản (0-9): ");
            int id = scanner.nextInt();

            if (id < 0 || id > 9) {
                System.out.println("ID không hợp lệ. Vui lòng nhập lại.");
                continue; // Nếu ID không hợp lệ, yêu cầu nhập lại
            }

            // Hiển thị menu chính
            while (true) {
                System.out.println("\n===== MENU CHÍNH =====");
                System.out.println("1: Xem số dư");
                System.out.println("2: Rút tiền");
                System.out.println("3: Gửi tiền");
                System.out.println("4: Thoát");
                System.out.print("Lựa chọn của bạn: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Xem số dư
                        System.out.println("Số dư hiện tại: $" + accounts[id].getBalance());
                        break;
                    case 2:
                        // Rút tiền
                        System.out.print("Nhập số tiền cần rút: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount < 0) {
                            System.out.println("Số tiền rút không hợp lệ. Vui lòng nhập lại.");
                        } else if (withdrawAmount > accounts[id].getBalance()) {
                            System.out.println("Không đủ số dư để rút.");
                        } else {
                            accounts[id].withdraw(withdrawAmount);
                            System.out.println("Số dư mới: $" + accounts[id].getBalance());
                        }
                        break;
                    case 3:
                        // Gửi tiền
                        System.out.print("Nhập số tiền cần gửi: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount < 0) {
                            System.out.println("Số tiền gửi không hợp lệ. Vui lòng nhập lại.");
                        } else {
                            accounts[id].deposit(depositAmount);
                            System.out.println("Số dư mới: $" + accounts[id].getBalance());
                        }
                        break;
                    case 4:
                        // Thoát
                        System.out.println("Đang quay lại màn hình nhập ID...");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                        break;
                }

                // Nếu người dùng chọn thoát, quay lại màn hình nhập ID
                if (choice == 4) {
                    break;
                }
            }
        }
    }
}

package T3H.Buoi2;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.println("Nhập phương thức cần chọn:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                tinhDiemSV();
                break;
            case 2:
                kiemTraTG();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("Kêt thúc");
                break;
            default:
                System.out.println("Lỗi, điền lại");
        }
        sc.close();
    }

    public static void menu() {
        System.out.println("+---------------------+");
        System.out.println("1. Tính điểm sinh viên");
        System.out.println("2. Kiểm tra loại tam giác");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+----------------------+");
    }

    public static void tinhDiemSV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm chuyên cần:");
        int diemCC = sc.nextInt();
        System.out.println("Điểm giữa kì:");
        int diemGK = sc.nextInt();
        System.out.println("Điểm cuối kì:");
        int diemCK = sc.nextInt();
        double diemTB = (diemCC + diemGK + diemCK) / 3;
        System.out.println("Điểm TB " + diemTB);

        if (diemTB >= 9) {
            System.out.println("Loại A");
        } else if (diemTB >= 7 && diemTB < 9) {
            System.out.println("Loại B");

        } else if (diemTB >= 5 && diemTB < 7) {
            System.out.println("Loại C");
        } else {
            System.out.println("Loại D");
        }
        sc.close();
    }

    public static void kiemTraTG() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số c:");
        int c = sc.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Các cạnh phải là số nguyên dương");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Đây ko phải là tam giác");

        } else {
            if (a == b && b == c) {
                System.out.println("Tam giác đều ");
            } else if (a == c || b == c || a == b) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác cân");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");

            } else {
                System.out.println("Tam giác thường");
            }
        }
        sc.close();
    }
    public static void tinhTienDien() {
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



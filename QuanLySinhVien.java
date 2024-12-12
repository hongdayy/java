package T3H.Buoi7;

import java.util.Scanner;

public class QuanLySinhVien {
    private SinhVien[] danhSach;
    private int soLuongSinhVien;

    public QuanLySinhVien() {
        danhSach = new SinhVien[10];
        soLuongSinhVien = 0;
    }

    public void themSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên:");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập mã sinh viên:");
        String maSinhVien = scanner.nextLine();

        for (int i = 0; i < soLuongSinhVien; i++) {
            if (danhSach[i].getMaSinhVien().equals(maSinhVien)) {
                System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên.");
                return;
            }
        }

        if (soLuongSinhVien == danhSach.length) {
            moRongMang();
        }

        danhSach[soLuongSinhVien] = new SinhVien(ten, tuoi, maSinhVien);
        soLuongSinhVien++;
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    public void suaSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần chỉnh sửa:");
        String maSinhVien = scanner.nextLine();

        boolean timThay = false;
        for (int i = 0; i < soLuongSinhVien; i++) {
            if (danhSach[i].getMaSinhVien().equals(maSinhVien)) {
                timThay = true;
                System.out.println("Thông tin sinh viên hiện tại: " + danhSach[i]);
                System.out.println("Nhập tên sinh viên chỉnh sửa:");
                String tenMoi = scanner.nextLine();
                System.out.println("Nhập tuổi sinh viên chỉnh sửa:");
                int tuoiMoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập mã sinh viên chỉnh sửa:");
                String maSinhVienMoi = scanner.nextLine();

                danhSach[i].setTen(tenMoi);
                danhSach[i].setTuoi(tuoiMoi);
                danhSach[i].setMaSinhVien(maSinhVienMoi);
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên với mã sinh viên này.");
        }
    }

    public void xoaSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần xóa:");
        String maSinhVien = scanner.nextLine();

        boolean timThay = false;
        for (int i = 0; i < soLuongSinhVien; i++) {
            if (danhSach[i].getMaSinhVien().equals(maSinhVien)) {
                timThay = true;
                for (int j = i; j < soLuongSinhVien - 1; j++) {
                    danhSach[j] = danhSach[j + 1];
                }
                soLuongSinhVien--;
                System.out.println("Sinh viên đã được xóa khỏi danh sách.");
                return;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên với mã sinh viên này.");
        }
    }

    public void timKiemTheoTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm:");
        String ten = scanner.nextLine();

        boolean timThay = false;
        for (int i = 0; i < soLuongSinhVien; i++) {
            if (danhSach[i].getTen().equals(ten)) {
                timThay = true;
                System.out.println("Kết quả tìm kiếm: " + danhSach[i]);
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên nào có tên " + ten + ".");
        }
    }

    public void hienThiDanhSach() {
        if (soLuongSinhVien == 0) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
        } else {
            System.out.println("Danh sách sinh viên hiện tại:");
            for (int i = 0; i < soLuongSinhVien; i++) {
                System.out.println(danhSach[i]);
            }
        }
    }

    public void moRongMang() {
        SinhVien[] danhSachMoi = new SinhVien[danhSach.length * 2];
        System.arraycopy(danhSach, 0, danhSachMoi, 0, danhSach.length);
        danhSach = danhSachMoi;
    }

    public void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Quản Lý Danh Sách Sinh Viên");
            System.out.println("1. Thêm sinh viên vào danh sách.");
            System.out.println("2. Sửa thông tin sinh viên.");
            System.out.println("3. Xóa sinh viên khỏi danh sách.");
            System.out.println("4. Tìm kiếm sinh viên theo tên.");
            System.out.println("5. Hiển thị danh sách sinh viên.");
            System.out.println("6. Thoát.");
            System.out.print("Chọn chức năng: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (luaChon) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    suaSinhVien();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    timKiemTheoTen();
                    break;
                case 5:
                    hienThiDanhSach();
                    break;
                case 6:
                    System.out.println("Đã thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }

    public static void main(String[] args) {
        QuanLySinhVien qlSinhVien = new QuanLySinhVien();
        qlSinhVien.hienThiMenu();
    }
}


package T3H.Buoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class SinhVien {
    String maSo;
    String ten;
    double diemThi;

    public SinhVien(String maSo, String ten, double diemThi) {
        this.maSo = maSo;
        this.ten = ten;
        this.diemThi = diemThi;
    }

    @Override
    public String toString() {
        return "Mã số: " + maSo + ", Tên: " + ten + ", Điểm thi: " + diemThi;
    }
}

public class QuanLySinhVien {

    private static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    private static HashSet<String> maSoSinhVienSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Sắp xếp sinh viên theo điểm thi");
            System.out.println("6. Kiểm tra sinh viên có tồn tại");
            System.out.println("0. Thoát");
            int chucNang = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (chucNang) {
                case 1:
                    themSinhVien(scanner);
                    break;
                case 2:
                    xoaSinhVien(scanner);
                    break;
                case 3:
                    hienThiDanhSach();
                    break;
                case 4:
                    timKiemSinhVien(scanner);
                    break;
                case 5:
                    sapXepSinhVien();
                    break;
                case 6:
                    kiemTraSinhVien(scanner);
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }

    public static void themSinhVien(Scanner scanner) {
        System.out.print("Nhập mã số sinh viên: ");
        String maSo = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập điểm thi: ");
        double diemThi = scanner.nextDouble();

        try {
            if (maSoSinhVienSet.contains(maSo)) {
                throw new Exception("Sinh viên với mã số " + maSo + " đã tồn tại.");
            }
            SinhVien sinhVienMoi = new SinhVien(maSo, ten, diemThi);
            danhSachSinhVien.add(sinhVienMoi);
            maSoSinhVienSet.add(maSo);
            System.out.println("Thêm sinh viên thành công.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void xoaSinhVien(Scanner scanner) {
        System.out.print("Nhập mã số sinh viên cần xóa: ");
        String maSo = scanner.nextLine();

        try {
            boolean timThay = false;
            for (SinhVien sv : danhSachSinhVien) {
                if (sv.maSo.equals(maSo)) {
                    danhSachSinhVien.remove(sv);
                    maSoSinhVienSet.remove(maSo);
                    timThay = true;
                    break;
                }
            }
            if (!timThay) {
                throw new Exception("Sinh viên với mã số " + maSo + " không tồn tại.");
            }
            System.out.println("Xóa sinh viên thành công.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void hienThiDanhSach() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (SinhVien sv : danhSachSinhVien) {
                System.out.println(sv);
            }
        }
    }

    public static void timKiemSinhVien(Scanner scanner) {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String ten = scanner.nextLine();

        try {
            boolean timThay = false;
            for (SinhVien sv : danhSachSinhVien) {
                if (sv.ten.equalsIgnoreCase(ten)) {
                    System.out.println(sv);
                    timThay = true;
                }
            }
            if (!timThay) {
                throw new Exception("Không tìm thấy sinh viên với tên " + ten + ".");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sapXepSinhVien() {
        try {
            if (danhSachSinhVien.isEmpty()) {
                throw new Exception("Danh sách sinh viên trống, không thể sắp xếp.");
            }
            Collections.sort(danhSachSinhVien, (sv1, sv2) -> Double.compare(sv1.diemThi, sv2.diemThi));
            System.out.println("Danh sách sinh viên đã được sắp xếp theo điểm thi.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void kiemTraSinhVien(Scanner scanner) {
        System.out.print("Nhập mã số sinh viên cần kiểm tra: ");
        String maSo = scanner.nextLine();

        if (maSoSinhVienSet.contains(maSo)) {
            System.out.println("Sinh viên với mã số " + maSo + " tồn tại.");
        } else {
            System.out.println("Sinh viên với mã số " + maSo + " không tồn tại.");
        }
    }
}

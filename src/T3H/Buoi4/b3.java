package T3H.Buoi4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        // 2.
        int tongChan = 0, tongLe = 0;
        for (int num : mang) {
            if (num % 2 == 0) {
                tongChan += num;
            } else {
                tongLe += num;
            }
        }
        System.out.println("Tổng các phần tử chẵn: " + tongChan);
        System.out.println("Tổng các phần tử lẻ: " + tongLe);

        // 3.
        List<Integer> soNguyenTo = new ArrayList<>();
        for (int num : mang) {
            if (kiemTraSoNguyenTo(num)) {
                soNguyenTo.add(num);
            }
        }
        System.out.println("Các số nguyên tố trong mảng: " + soNguyenTo);

        // 4.
        Arrays.sort(mang);
        int[] mangChan = Arrays.stream(mang).filter(x -> x % 2 == 0).boxed()
                .sorted((a, b) -> b - a) // Sắp xếp giảm dần
                .mapToInt(i -> i).toArray();
        int[] mangLe = Arrays.stream(mang).filter(x -> x % 2 != 0).boxed()
                .sorted() // Sắp xếp tăng dần
                .mapToInt(i -> i).toArray();
        System.out.println("Mảng chẵn đã sắp xếp: " + Arrays.toString(mangChan));
        System.out.println("Mảng lẻ đã sắp xếp: " + Arrays.toString(mangLe));

        // 5.
        double trungBinh = Arrays.stream(mang).average().orElse(0);
        List<Integer> mangNhoHonTrungBinh = new ArrayList<>();
        List<Integer> mangLonHonTrungBinh = new ArrayList<>();

        for (int num : mang) {
            if (num <= trungBinh) {
                mangNhoHonTrungBinh.add(num);
            } else {
                mangLonHonTrungBinh.add(num);
            }
        }
        System.out.println("Mảng con nhỏ hơn hoặc bằng trung bình: " + mangNhoHonTrungBinh);
        System.out.println("Mảng con lớn hơn trung bình: " + mangLonHonTrungBinh);

        // 6.
        HashMap<Integer, Integer> soLuongTrungLap = new HashMap<>();
        for (int num : mang) {
            soLuongTrungLap.put(num, soLuongTrungLap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Các phần tử trùng lặp:");
        soLuongTrungLap.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " xuất hiện " + value + " lần");
            }
        });

        // 7.
        System.out.print("Nhập phần tử cần thêm: ");
        int phanTuThem = scanner.nextInt();
        System.out.print("Nhập vị trí (index) để thêm: ");
        int indexThem = scanner.nextInt();

        mang = themPhanTu(mang, phanTuThem, indexThem);
        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(mang));

        // 8.
        System.out.print("Nhập giá trị phần tử cần xóa: ");
        int phanTuXoa = scanner.nextInt();
        mang = xoaPhanTu(mang, phanTuXoa);
        System.out.println("Mảng sau khi xóa phần tử: " + Arrays.toString(mang));

        scanner.close();
    }

    private static boolean kiemTraSoNguyenTo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static int[] themPhanTu(int[] mang, int phanTu, int index) {
        if (index < 0 || index > mang.length) {
            System.out.println("Vị trí không hợp lệ.");
            return mang;
        }

        int[] mangMoi = new int[mang.length + 1];
        for (int i = 0; i < index; i++) {
            mangMoi[i] = mang[i];
        }
        mangMoi[index] = phanTu;
        for (int i = index; i < mang.length; i++) {
            mangMoi[i + 1] = mang[i];
        }
        return mangMoi;
    }

    private static int[] xoaPhanTu(int[] mang, int phanTu) {
        int count = 0;
        for (int num : mang) {
            if (num == phanTu) count++;
        }

        if (count == 0) {
            System.out.println("Phần tử không tồn tại trong mảng.");
            return mang;
        }

        int[] mangMoi = new int[mang.length - count];
        int index = 0;
        for (int num : mang) {
            if (num != phanTu) {
                mangMoi[index++] = num;
            }
        }
        return mangMoi;
    }
}
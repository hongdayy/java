package T3H.Buoi4;

import java.util.HashMap;
import java.util.Map;

public class b1 {
    public static void main(String[] args) {
        String chuoiNhap = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        // a)
        demSoLuongTu(chuoiNhap);
        // b)
        String chuoiViethoa = vietHoaChuDau(chuoiNhap);
        System.out.println("Viết hoa chữ đầu trong mỗi từ:");
        System.out.println(chuoiViethoa);
        // c)
        String chuoiKhongNguyenAm = xoaNguyenAm(chuoiNhap);
        System.out.println("Xóa các nguyên âm:");
        System.out.println(chuoiKhongNguyenAm);
    }

    private static void demSoLuongTu(String chuoi) {
        String[] mangTu = chuoi.toLowerCase().split("\\W+");
        Map<String, Integer> soLuongTu = new HashMap<>();

        for (String tu : mangTu) {
            soLuongTu.put(tu, soLuongTu.getOrDefault(tu, 0) + 1);
        }

        System.out.println("Số lượng từng từ:");
        for (Map.Entry<String, Integer> entry : soLuongTu.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " từ");
        }
    }

    private static String vietHoaChuDau(String chuoi) {
        String[] mangTu = chuoi.split("\\s+");
        StringBuilder chuoiViethoa = new StringBuilder();

        for (String tu : mangTu) {
            if (tu.length() > 0) {
                chuoiViethoa.append(Character.toUpperCase(tu.charAt(0)))
                        .append(tu.substring(1)).append(" ");
            }
        }
        return chuoiViethoa.toString().trim();
    }

    private static String xoaNguyenAm(String chuoi) {
        return chuoi.replaceAll("[aeiouAEIOU]", "");
    }
}
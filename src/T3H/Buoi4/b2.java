package T3H.Buoi4;

public class b2 {
    public static void main(String[] args) {
        // Một số ví dụ để kiểm tra
        String[] soDienThoai = {
                "+84123456789",
                "0123456789",
                "84123456789",
                "0xxx.xxx.xxx",
                "0xxx-xxx-xxx",
                "012345678",    // Không hợp lệ
                "0abc-xyz-789"  // Không hợp lệ
        };

        for (String sdt : soDienThoai) {
            System.out.println(sdt + " có phải số điện thoại hợp lệ? " + kiemTraSoDienThoai(sdt));
        }
    }

    private static boolean kiemTraSoDienThoai(String sdt) {
        // Kiểm tra chiều dài
        if (sdt.length() != 11 && sdt.length() != 12) {
            return false;
        }

        // Kiểm tra các định dạng số điện thoại
        if (sdt.startsWith("+84") && sdt.length() == 12) {
            return kiemTraSoTu(sdt.substring(3));
        } else if (sdt.startsWith("0") && sdt.length() == 11) {
            return kiemTraSoTu(sdt.substring(1));
        } else if (sdt.startsWith("84") && sdt.length() == 11) {
            return kiemTraSoTu(sdt.substring(2));
        }
        return false;
    }

    private static boolean kiemTraSoTu(String sdt) {
        // Kiểm tra từng ký tự
        for (char c : sdt.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
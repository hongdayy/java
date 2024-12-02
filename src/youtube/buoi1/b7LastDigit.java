package youtube.buoi1;

import java.util.Scanner;

public class b7LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int lastDigit = (int) (n % 10);
        int lastTwoDigit = (int) (n % 100);

        System.out.println(lastDigit);

        // Kiểm tra nếu hai chữ số cuối cùng có số 0 ở đầu
        if(lastTwoDigit < 10) {
            // In lại chữ số cuối cùng nếu chỉ có 1 chữ số
            System.out.println(lastDigit);
        } else {
            // In ra hai chữ số cuối cùng
            System.out.println(lastTwoDigit);
        }
    }
}

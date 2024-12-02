package youtube.buoi3Loop;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                tong+=i;
            }
        }
        System.out.println(tong);
    }
}

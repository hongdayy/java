package youtube.buoi3Loop;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            tong+= i * i;

        }
        System.out.println(tong);
    }
}

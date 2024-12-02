package youtube.buoi1;

import java.util.Scanner;

public class b12Fx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        long result = 5L * x + 2L * y + 1L * x * y;
        System.out.println(result);
    }
}

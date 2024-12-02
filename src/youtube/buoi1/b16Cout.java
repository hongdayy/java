package youtube.buoi1;

import java.util.Scanner;

public class b16Cout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println(x + "  " + y + "  " + z + "  " + t);
        System.out.println(x + "-" + y + "-" + z + "-" + t);
        System.out.println(2 * x + "," + 3 * y + "," + 4 * z + "," + 5 * t);
        System.out.println("Kết thúc");
    }
}

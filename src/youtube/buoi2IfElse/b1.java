package youtube.buoi2IfElse;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long result = (long) Math.pow(x, 3) + 3L * x * x + x + 1;
        System.out.println(result);


    }
}

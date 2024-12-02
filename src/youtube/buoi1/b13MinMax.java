package youtube.buoi1;

import java.util.Scanner;

public class b13MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println(Math.max(x,y));
        System.out.println(Math.min(z,t));
        System.out.println(Math.max(Math.max(x,y),z));
        System.out.println(Math.min(Math.min(x,y),Math.min(z,t)));
    }
}

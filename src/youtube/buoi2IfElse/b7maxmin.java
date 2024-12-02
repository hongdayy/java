package youtube.buoi2IfElse;

import java.util.Scanner;

public class b7maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int st1 = (a / b) * b;
        int st2 = (a + b - 1)/b * b;
        if (a % b == 0) {
            st1 = a; // Nếu a chia hết cho b thì số cần tìm chính là a
        } else {
            st2 = ((a / b) + 1) * b; // Nếu không, tính số tiếp theo chia hết cho b
        }

        System.out.println(st1);
        System.out.println(st2);

    }
}

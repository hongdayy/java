package youtube.buoi3Loop;

import java.util.Scanner;

public class b0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // dòng 1
        System.out.print("Dòng 1:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // xuống dòng
        // dòng 2
        System.out.print("Dòng 2: ");
        int i = n;
        while (i >= 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        // dòng 3
        System.out.print("Dòng 3:");
        for (int j = 0; j <= n; j+=2) {
                System.out.print(j + " ");

        }
        System.out.println();
        // dòng 4
        System.out.print("Dòng 4: ");
        for (int k = 1; k <= n; k+=2) {
                System.out.print(k + " ");
            }
        System.out.println();
        // dòng 5
        System.out.print("Dòng 5:");
        for (int l = 0; l <= n; l+=4) {
            System.out.print(l + " ");
        }
        System.out.println();
        // dòng 6
        System.out.print("Dòng 6: ");
        for (int m = 0; m <= n; m++) {
            System.out.print((char)('a'+ m)+ " ");
        }
        System.out.println();
        // dòng 7
        System.out.print("Dòng 7:");
        int k = 0;
        while (k < n) {
            System.out.print((char)('z' - (n - 1 - k)) + " ");
            k++;
        }
        System.out.println();
        sc.close();
    }

}

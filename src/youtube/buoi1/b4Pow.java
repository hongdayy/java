package youtube.buoi1;

import java.util.Scanner;

public class b4Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double result = Math.pow(x, y);

         if(result == (int)result) {
             System.out.println((int)result);
         } else {
             System.out.printf("%.2f", result);
         }
    }
}

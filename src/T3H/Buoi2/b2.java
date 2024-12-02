package T3H.Buoi2;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số c:");
        int c = sc.nextInt();

        if(a < 0 || b <0 || c < 0) {
            System.out.println("Các cạnh phải là số nguyên dương");
        } else if (a + b <= c || b+ c <=a || a + c <= b) {
            System.out.println("Đây ko phải là tam giác");
            
        } else  {
            if( a == b && b == c) {
                System.out.println("Tam giác đều ");
            } else if ( a == c || b == c || a == b) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác cân");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");

            } else {
                System.out.println("Tam giác thường");
        }
        }
sc.close();
    }
}

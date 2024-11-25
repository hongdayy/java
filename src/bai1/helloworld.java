package bai1;

import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        // câu lên in ra trên màn hihhf console
        System.out.println("hello world");
        System.out.println("nhập vào tên giảng viên:");
        // nhập dữ liệu từ bàn phím
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên giảng viên:" + name);
    }
}

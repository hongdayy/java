package T3H.Buoi6;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal {
    String ten;
    int tuoi;

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public abstract void action();

    public void showInfo() {
        System.out.println("Tên: " + ten + ", Tuổi: " + tuoi);
    }
}

class Lion extends Animal {
    public Lion(String ten, int tuoi) {
        super(ten, tuoi);
    }

    @Override
    public void action() {
        System.out.println("The lion is hunting.");
    }
}

class Elephant extends Animal {
    public Elephant(String ten, int tuoi) {
        super(ten, tuoi);
    }

    @Override
    public void action() {
        System.out.println("The elephant is spraying water.");
    }
}

class Monkey extends Animal {
    public Monkey(String ten, int tuoi) {
        super(ten, tuoi);
    }

    @Override
    public void action() {
        System.out.println("The monkey is climbing trees.");
    }
}

class ManagerAnimal {
    ArrayList<Animal> danhSach;

    public ManagerAnimal() {
        danhSach = new ArrayList<>();
    }

    public void themDongVat(Animal animal) {
        danhSach.add(animal);
    }

    public void hienThiDanhSach() {
        for (Animal animal : danhSach) {
            animal.showInfo();
            animal.action();
        }
    }

    public void timKiemDongVat(String ten) {
        for (Animal animal : danhSach) {
            if (animal.ten.equalsIgnoreCase(ten)) {
                animal.showInfo();
                animal.action();
                return;
            }
        }
        System.out.println("Không tìm thấy động vật có tên: " + ten);
    }

    public void xoaDongVat(String ten) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).ten.equalsIgnoreCase(ten)) {
                danhSach.remove(i);
                System.out.println("Đã xóa động vật có tên: " + ten);
                return;
            }
        }
        System.out.println("Không tìm thấy động vật có tên: " + ten);
    }

    public int tongSoLuongDongVat() {
        return danhSach.size();
    }
}

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAnimal manager = new ManagerAnimal();

        while (true) {
            System.out.println("Chọn hành động:");
            System.out.println("1. Nhập vào Lion");
            System.out.println("2. Nhập vào Elephant");
            System.out.println("3. Nhập vào Monkey");
            System.out.println("4. Dừng nhập");
            System.out.println("5. Hiển thị danh sách động vật");
            System.out.println("6. Tìm kiếm động vật theo tên");
            System.out.println("7. Xóa động vật theo tên");
            System.out.println("8. Tổng số lượng động vật");
            System.out.print("Lựa chọn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (luaChon == 1) {
                System.out.print("Nhập tên Lion: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập tuổi Lion: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine(); // consume newline
                manager.themDongVat(new Lion(ten, tuoi));
            } else if (luaChon == 2) {
                System.out.print("Nhập tên Elephant: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập tuổi Elephant: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine(); // consume newline
                manager.themDongVat(new Elephant(ten, tuoi));
            } else if (luaChon == 3) {
                System.out.print("Nhập tên Monkey: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập tuổi Monkey: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine(); // consume newline
                manager.themDongVat(new Monkey(ten, tuoi));
            } else if (luaChon == 4) {
                break;
            } else if (luaChon == 5) {
                manager.hienThiDanhSach();
            } else if (luaChon == 6) {
                System.out.print("Nhập tên con vật cần tìm: ");
                String ten = scanner.nextLine();
                manager.timKiemDongVat(ten);
            } else if (luaChon == 7) {
                System.out.print("Nhập tên con vật cần xóa: ");
                String ten = scanner.nextLine();
                manager.xoaDongVat(ten);
            } else if (luaChon == 8) {
                System.out.println("Tổng số lượng động vật trong sở thú: " + manager.tongSoLuongDongVat());
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }
        }
        scanner.close();
    }
}

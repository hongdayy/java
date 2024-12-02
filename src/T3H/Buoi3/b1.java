package T3H.Buoi3;

public class b1 {
    public static void main(String[] args) {
        int target = 200000;
        int count = 0;

        for (int x = 0; x <= target / 1000; x++) {
            for (int y = 0; y <= (target - 1000 * x) / 2000; y++) {
                int remaining = target - 1000 * x - 2000 * y;
                if (remaining >= 0 && remaining % 5000 == 0) {
                    int z = remaining / 5000;
                    System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);
                    count++;
                }
            }
        }
        System.out.printf("Tổng số phương án: %d%n", count);
    }
}

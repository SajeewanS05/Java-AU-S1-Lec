public class Divisible5and6 {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

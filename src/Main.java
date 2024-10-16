import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту: ");
        int h = scanner.nextInt();
        System.out.print("Введите ширину: ");
        int w = scanner.nextInt();

        drawTriangle(h, w);
    }

    public static void drawTriangle(int height, int width) {
        for (int line = 0; line < height; line++) {
            System.out.println();
            // вывод пробелов
            for (int j = 0; j < line; j++) {
                System.out.print(" ");
            }

            // вывод цифр
            for (int n = 0; n < width - line; n++) {
                System.out.print(n % 10);
            }
        }
    }
}
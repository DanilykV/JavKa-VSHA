import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int x = scanner.nextInt();

        System.out.println("Введите второе число:");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x * 5);
        } else {
            System.out.println(y * 5);
        }
    }
}
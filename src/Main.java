import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a= 15;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        // Вызываем метод для нахождения суммы чисел от 1 до N
        int sum = calculateSum(n);

        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
    }

    // Метод для нахождения суммы чисел от 1 до N
    private static int calculateSum(int n) {
        int sum = 0;
        int c=2;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int a = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int b = scanner.nextInt();
        System.out.println("Вычисляем...");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }  
}
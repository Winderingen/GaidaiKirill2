import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int ch = scanner.nextInt();

        boolean prov = true;
        for (int i = 2; i <= Math.sqrt(ch); i++) {
            if (ch % i == 0) {
                prov = false;
                break;
            }
        }
        System.out.println("Считывание завершено, начинаем проверку...");
        if (prov && ch > 1) {
            System.out.println(ch + " является простым числом");
        } else {
            System.out.println(ch + " не является простым числом");
        }
    }  
}
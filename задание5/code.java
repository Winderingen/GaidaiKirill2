import java.util.*;

public class Code
{
    public static void main(String[] args) {
        System.out.println("Введите ваш ряд чисел: ");
        System.out.println("Когда закончите, введите в поле «stop»");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num * num;
        }
        System.out.println("Считывание элементов завершено, начинаем подсчет...");
        System.out.println("Сумма квадратов введенных элементов равна: "+sum);
    }  
}
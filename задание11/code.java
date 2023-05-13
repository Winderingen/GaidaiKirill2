import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для удаления гласных:");
        String str = scanner.nextLine();

        // Удаляем все гласные из строки
        String result = str.replaceAll("[aeiouAEIOUауоеёиыэюяАУОЕЁИЫЭЮЯ]", "");

        System.out.println("Получившаяся строка: " + result);
    } 
}
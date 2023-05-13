import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String input = scanner.nextLine();
        System.out.println("Начинаем обработку...");
        String[] words = input.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        String output = String.join(" ", uniqueWords);
        System.out.println("Вот что у нас получилось: ");
        System.out.println(output);
    }      
}
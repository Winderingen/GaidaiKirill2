import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку для преобразования: ");
        String input = scanner.nextLine();

        int S1 = 0;
        int S2 = 0;
        System.out.println("Преобразуем...");
        for (int i = 0; i < input.length(); i++) {
            char M = input.charAt(i);
            if (Character.isUpperCase(M)) {
                S1++;
            } else if (Character.isLowerCase(M)) {
                S2++;
            }
        }
        String output;
        if (S1 > S2) {
            output = input.toUpperCase();
        } else if (S1 < S2) {
            output = input.toLowerCase();
        } else {
            output = input.toLowerCase();
        }
        System.out.println("Преобразование окончено; вот ваша строка: ");
        System.out.println(output);
    }     
}
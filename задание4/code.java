import java.util.*;

public class Code
{
        public static void main(String[] args) {
            Scanner str0 = new Scanner(System.in);
            System.out.println("Введите слово или словосочетание для проверки:");
            String str = str0.nextLine();
            Scanner ch0 = new Scanner(System.in);
            System.out.println("Введите букву для поиска:");
            String ch = ch0.nextLine();
            char ch1=ch.charAt(0);
            int count = str_count(str, ch1);
            System.out.println("Ведем подсчет...");
            System.out.println("Буква: «"+ch+"» Встречается в слове/словосочетании: «"+str+"» "+count+" раз(а).");
            System.out.println("Спасибо за использование нашего продукта!");
        }
        public static int str_count(String str, char ch) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            return count;
        }
}
import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите слово или фразу для кодировки: ");
        String cipheredText = v.nextLine();
        Map<Character, Integer> frequencies = getFrequencies(cipheredText);
        frequencies.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
    public static Map<Character, Integer> getFrequencies(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
            }
        }
        return frequencies;
    }  
}
import java.util.*;

public class Code
{
    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        String[] weights = input.split(" ");
        Arrays.sort(weights, Comparator.comparingInt(Code::sumOfDigits).reversed());
        System.out.println(String.join(" ", weights));
    }
    private static int sumOfDigits(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }  
}
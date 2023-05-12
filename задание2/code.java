import java.util.*;

public class Code
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Если вы сотрудник, введите 1. Иначе 0");
        System.out.println("Для завершения учета, введите 2");
        List<String> rabotnik = new ArrayList<String>();
        var n = in.nextInt();
        int i = 0;
        if (n < 2) {
            if(n==1){
                i++;
                rabotnik.add("true");
            } else {
                rabotnik.add("false");
            }
        }
        while (n < 2){
            n = in.nextInt();
            if (n == 1){
                i++;
                rabotnik.add("true");
            } else {
                rabotnik.add("false");
            }
        }
        int index = rabotnik.size() - 1;
        rabotnik.remove(index);
        System.out.println(rabotnik + "\n" + "Количество работников, пришедших на смену: " + i);

    }

}
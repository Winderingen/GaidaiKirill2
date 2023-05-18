import java.util.*;

public class Code
{
    private static final ArrayList<Integer> num_players = new ArrayList<>();
    private static final ArrayList<Integer> retired = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        int n = scanner.nextInt();
        System.out.println("Введите номер игрока: ");
        int start = scanner.nextInt();
        System.out.println("Кол-во игроков: " + n + "\n" + "Номер игрока: "
                + (start - 1 ));
        for (int i = 1; i <= n; i++) {
            num_players.add(i);
        }
        for(int j = 1; j < num_players.size() + 1; j++) {
            start = element_index(start);
        }
        System.out.println(retired.toString());
    }
    public static int element_index(int delete_i) {
        if (delete_i >= num_players.size()) {
            while (delete_i >=  num_players.size()) {
                delete_i -= num_players.size();
            }
        }
        retired.add(num_players.get(delete_i));
        num_players.remove(delete_i);
        return delete_i + 2;
    }  
}
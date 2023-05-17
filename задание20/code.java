import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Code
{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введите высоту массива: ");
        int m = v.nextInt();
        System.out.println("Введите ширину массива: ");
        int n = v.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ring = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                array[i][j] = ring + 1;
            }
        }
        try (FileWriter writer = new FileWriter("array.txt")) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
}
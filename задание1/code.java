import java.util.Scanner;

public class Code {
    public Code() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = s.nextInt();
        System.out.println("Введите количество столбцов: ");
        int m = s.nextInt();
        System.out.println("Введите вашу матрицу: ");
        int[][] a = new int[m][n];
        int[][] b = new int[n][m];

        int i;
        int j;
        for(i = 0; i < n; ++i) {
            for(j = 0; j < m; ++j) {
                b[i][j] = s.nextInt();
            }
        }

        for(i = 0; i < a.length; ++i) {
            for(j = 0; j < a[i].length; ++j) {
                a[i][j] = b[j][i];
            }
        }

        System.out.println("Ваша транспонированная матрица: ");

        for(i = 0; i < a.length; ++i) {
            for(j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

    }
}
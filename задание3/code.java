import java.util.*;

public class Code
{
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу поиска барицентра треугольника!");
        Scanner in = new Scanner(System.in);
        float edf[][] = new float[3][2];
        int n = 1;
        for(int i = 0; i < 3; i++){
            System.out.println("Укажите вершину " + n);
            n++;
            for(int j = 0; j < 2; j++){
                edf[i][j] = in.nextInt();
            }
        }
        System.out.println("Ваш ответ " + "{"
                + (edf[0][0] + edf[1][0] + edf[2][0])/3 + ","
                + (edf[0][1] + edf[1][1] + edf[2][1])/3 + "}");
    }

}
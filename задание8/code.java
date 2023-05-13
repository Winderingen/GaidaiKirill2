import java.util.Scanner;

public class Code
{
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу вероятностей!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины сторон предполагаемого треугольника:");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        System.out.println("Начинаем вычисления...");
        if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
            double a = Math.acos((s2 * s2 + s3 * s3 - s1 * s1) / (2.0 * s2 * s3));
            double b = Math.acos((s3 * s3 + s1 * s1 - s2 * s2) / (2.0 * s3 * s1));
            double c = Math.acos((s1 * s1 + s2 * s2 - s3 * s3) / (2.0 * s1 * s2));

            double maxUgol = Math.toDegrees(Math.max(a, Math.max(b, c)));

            System.out.println("Можно составить треугольник. Наибольший внешний угол: " + maxUgol);
        } else {
            System.out.println("Из данных отрезков невозможно составить треугольник.");
        }
    }  
}
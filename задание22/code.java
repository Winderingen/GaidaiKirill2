import java.util.*;

public class Code
{
    public static void main(String[] args){
        System.out.println("Добро пожаловать в программу поиска площади треугольника!");
        Scanner alpha = new Scanner(System.in);
        System.out.println("Введите первую сторону:");
        int a = alpha.nextInt();
        System.out.println("Введите вторую сторону:");
        int b = alpha.nextInt();
        System.out.println("Введите третью строку:");
        int c = alpha.nextInt();
        System.out.println("Вычисляем...");
        if((a+b)>c && (b+c)>a && (a+c)>b){
            double square = square(a,b,c);
            System.out.println("Ваша площадь готова!");
            System.out.println(square);
        }
        else {
            System.out.println("Неверно введены стороны, попробуйте снова.");
        }
    }
    public static double square(double a,double b,double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }  
}
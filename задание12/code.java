import java.util.*;

public class Code
{
    public static void main(String[] args){
        System.out.println("Добро пожаловать в систему последовательностей!");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = s.nextInt();
        System.out.println("Введите второе число: ");
        int b = s.nextInt();
        System.out.println("Начинаю поиск последовательноти...");
        System.out.println("Ваша последовательность:");
        if(a < b){
            while(a <= b){
                System.out.println(a*a);
                a++;
            }
        }
        if(b < a){
            while(b <= a){
                System.out.println(b*b);
                b++;
            }
        }
    }  
}
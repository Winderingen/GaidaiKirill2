import java.util.*;

public class Code
{
    public static void main(String[] args){
        System.out.println("Введите ваш квадрат: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        System.out.println("Ведем подсчет...");
        System.out.println("Ближайшее число к введенному вами значению: "+Math.round(Math.sqrt(num)));
    }  
}
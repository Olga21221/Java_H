import java.util.Scanner;

/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

class Task001 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int str = sc.nextInt();
        double t = (0.5 * str) * (str + 1);
        System.out.print(t);
    }
}
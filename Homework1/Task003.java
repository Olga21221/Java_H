import java.util.Scanner;

// Реализовать простой калькулятор
public class Task003 {
    public static void main(String[] args) {
            System.out.print("Введите значения через запятую: ");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            String s = sc.next();
            int num2 = sc.nextInt();
            sc.close();
            switch (s) {
                case "*":
                    System.out.println(num1*num2);
                    break;
                case "/":
                    System.out.println(num1/num2);
                    break;
                case "+":
                    System.out.println(num1+num2);
                    break;
                case "-":
                    System.out.println(num1-num2);
                    break;
            
                default:
                    break;
            }
    }
}

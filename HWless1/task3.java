//Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.print("J");
        float c = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        float a = userInput.nextInt();
        System.out.printf("Введите второе число: ");
        float b = userInput.nextInt();
        System.out.printf("Какую операцию Вы хотите выполнить? Введите '+', '-', '*' или '/': ");
        String n = userInput.next();
        userInput.close();

        if (b == 0)
            System.out.println("На ноль нельзя! Попробуйте еще раз.");
        else {
            switch (n) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "/":
                    c = a / b;
                    break;
                case "*":
                    c = a + b;
                    break;
            }
            System.out.printf("%.2f", c);
        }
        
    }
}
// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("J");
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = Integer.parseInt(userInput.nextLine());
        userInput.close();

        if (n < 0) {
            System.out.println("Операция невозможна. Введите число больше '0'!");
        } else if (n == 0) {
            System.out.println(
                    "При значении ввода равным '0', значение треугольного чилса булет равно '0', а факториала равно '1'! ");
        } else {
            System.out.printf("Треугольное число %d равно %d\n", n, triangle(n));
            System.out.printf("Факториал числа %d равен %d\n", n, factorial(n));
        }

    }

    static int triangle(int n) {
        if (n == 1)
            return 1;
        return n + triangle(n - 1);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

}
package JavaHW.HWLess3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Task1 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        List<Integer> listOfDigits = new ArrayList<>();
        Random random = new Random();

        Scanner userInput = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int n = Integer.parseInt(userInput.nextLine());
        userInput.close();

        for (int i = 0; i < n; i++) {
            listOfDigits.add(random.nextInt(0, 10));
        }

        System.out.println("Изначальный массив: ");
        for (int item : listOfDigits) {
            System.out.print(item + " ");

        }
        Collections.sort(listOfDigits);
        System.out.println();
        System.out.println("Значение минимального элемента =  " + listOfDigits.get(0));
        System.out.println("Значение максимального элемента = " + listOfDigits.get(n - 1));

        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += listOfDigits.get(i);
        }
        System.out.printf("Среднее арифметическое всех значений = " + "%.2f\n", sum / n);
    }

}
package JavaHW.HWLess3;

// 2 Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        List<Integer> newList = new ArrayList<>();
        Random rnd = new Random();

        Scanner userInput = new Scanner(System.in);
        System.out.printf("Введите длину списка: \n");
        int n = Integer.parseInt(userInput.nextLine());
        userInput.close();

        for (int i = 0; i < n; i++) {
            newList.add(rnd.nextInt(0, 100));
        }

        System.out.print("Исходный список: " + newList);

        // 1 вариант

        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) % 2 == 0) {
                newList.remove(i);
                i--;
            }
        }
        System.out.print("\nСписок без чётных чисел по первому варианту решения: " + newList);

        // 2 вариант

        List<Integer> evenList = new ArrayList<>();
        for (Integer item : newList) {
            if (item % 2 == 0)
                evenList.add(item);
        }
        newList.removeAll(evenList);
        System.out.print("\nСписок без чётных чисел по второму варианту решения: " + newList); 
    }
}
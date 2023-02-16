//Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {

        System.out.print("J");
        boolean b = true;
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    b = false;
                    break;
                }
            }
            if (b == true) System.out.printf(" " + i + " ");
            else b = true;
        }
    }
}
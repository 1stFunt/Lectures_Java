import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        // task1(); // Сканнер
        // task2(); // Вывести максимальное кол-во подряд идущих элементов
        int n = secondWay(50); // Второй способ решения второй задачи
        System.out.print(n); // Через return в самомо методе. Void метод заменили на int
    }

    private static void task1() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("Hello, %s", name);
        in.close();
    }

    private static void task2() {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.print(maxCount);
    }

    private static int secondWay(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2); // от 0 до 1
        }
        // for (int i = 0; i < arr.length; i++) {
        // int num = arr[i];
        // System.out.print(num);
        // }
        // // или
        // for (int num : arr) {
        // System.out.print(num);
        // }
        int count = 0;
        int maxCount = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        return maxCount;
    }
}
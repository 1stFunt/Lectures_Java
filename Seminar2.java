import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Seminar2 {
    public static void main(String[] args) {
        // test();
        // task1(); // Написать метод, который вернёт строку длины N, которая состояит из чередующихся символов s1 и s2
        // task2_1(); // Написать метод, который сжимает строку
        // task2_2(); // Второй способ решения второй задачи
        task3("C:\\Users\\Funt\\Desktop\\Java");
    }

    private static void test() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("i: ").append(i).append(" -> ").append((char) i).append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    private static void task1() {
        char firstSymbol = '1';
        char secondSymbol = '-';
        StringBuilder sb = new StringBuilder();
        int n = 7;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(firstSymbol);
            } else {
                sb.append(secondSymbol);
            }
        }
        System.out.println(sb);
    }

    private static void task2_1() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        char prev = longString.charAt(0);
        char curr = prev;
        int counter = 1;

        for (int i = 1; i < longString.length(); i++) {
            prev = longString.charAt(i - 1);
            curr = longString.charAt(i);
            if (prev != curr) {
                shortStringSB.append(prev);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        shortStringSB.append(curr);
        shortStringSB.append((counter > 1) ? counter : "");

        System.out.printf("%s -> %s", longString, shortStringSB);
    }

    private static void task2_2() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        // char[] charStringArr = longString.toCharArray(); // Можно через массив, подправив некоторые переменные ниже
        char curr = 0;
        char next = 0;
        int counter = 0;

        for (int i = 0; i < longString.length() - 1; i++) {
            counter++;
            curr = longString.charAt(i);
            next = longString.charAt(i + 1);
            if (curr != next) {
                shortStringSB.append(curr);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;
            }
        }
        shortStringSB.append(next);
        shortStringSB.append((counter >= 1) ? counter + 1 : "");

        System.out.printf("%s -> %s%n", longString, shortStringSB);
    }

    private static void task3(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()) {
            return;
        }

        String[] dirListNames = file.list();

        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames) {
            sb.append(fileName).append(System.lineSeparator());
        }
        // System.out.println(sb);
        try (PrintWriter pw = new PrintWriter("For_task3_from_Seminar2/output.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
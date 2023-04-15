import java.util.*;

public class Seminar6 {
    public static void main(String[] args) {
        // ex0();
        int n = 1000;
        Integer[] arr = fillArray(n);
        System.out.println(Arrays.toString(arr));
        double uniqueValue = uniqueValuesInArray(arr);
        System.out.println(uniqueValue);
    }

    private static Integer[] fillArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    private static double uniqueValuesInArray(Integer[] array) {
        Set <Integer> set = new HashSet<>(Arrays.asList(array));
        return 1.0 * set.size() * 100 / array.length;
    }

    private static void ex0() {
        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять",
                "Десять");
        // List<?> data = List.of(1, 2, 3, 4, 5, 6, 2, 1, 4, 1, 12, 1, 14, 5, 16, 17,
        // 33, 45, 65, 22, 13);
        var dataNew = new ArrayList<>(data);
        Collections.reverse(dataNew);

        System.out.println(new HashSet<>(dataNew));
        System.out.println(new LinkedHashSet<>(dataNew));
        System.out.println(new TreeSet<>(dataNew));
    }
}
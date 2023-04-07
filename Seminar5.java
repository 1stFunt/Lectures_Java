import java.util.HashMap;
import java.util.Map;

public class Seminar5 {
    public static void main(String[] args) {
        // ex0();
        System.out.println("MMCMXCIX -> " + ex3("MMCMXCIX"));
    }

    private static void ex0() {
        Map<String, String> passportsToSernameMap = new HashMap<>();
        passportsToSernameMap.put("134234", "Иванов");
        passportsToSernameMap.put("345345", "Петров");
        passportsToSernameMap.put("546456", "Васильев");

        // Варианты перебора/вывода
        /*
         * System.out.println(passportsToSernameMap);
         * 
         * for (Map.Entry<String, String> entry : passportsToSernameMap.entrySet()) {
         * System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
         * }
         */

        /*
         * for (String key : passportsToSernameMap.keySet()) {
         * System.out.printf("%s\t%s%n", key, passportsToSernameMap.get(key));
         * }
         */

        /*
         * passportsToSernameMap.forEach((key, value) -> System.out.printf(
         * "%s\t%s%n",
         * key, value)
         * );
         */
    }

    private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse(); // переворачиваем строчку, 
        int decimalNum = 0;                                                      // чтоб не обрабатывать послед. символ
        int prevNum = -1;

        for (Character romanChar : romanNumSB.toString().toCharArray()) {
            int currentNum = romanToDecimalMap.get(romanChar);
            if (currentNum < prevNum) {
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;
        }
        return decimalNum;
    }
}
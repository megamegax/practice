import java.util.ArrayList;
import java.util.List;

public class ListManagementSolution {
    /**
     * 1. task
     * Reverse the input list
     *
     * @param inputList list of strings
     * @return list of the reversed list of inputList
     */
    List<String> reverseList(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (int i = inputList.size() - 1; i >= 0; i--) {
            result.add(inputList.get(i));
        }
        return result;
    }

    /**
     * 2. task
     * Reverse the order of the list and filter the even numbers
     *
     * @param inputList list of input numbers
     * @return a list of the reversed list filtered to even numbers
     */
    List<Integer> reverseAndFilter(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        for (int i = inputList.size() - 1; i >= 0; i--) {
            if (inputList.get(i) % 2 == 0)
                result.add(inputList.get(i));
        }
        return result;
    }

    /**
     * 3. task
     * Calculate a series of numbers where each number is calculated like
     * a+(2^i)*(2^i+1)...*b
     * Example
     * 1+(2^0)*2,1+(2^0)*(2^1)*2,1+(2^0)*(2^1)**(2^2)*2
     *
     * @param a      first param for calculation
     * @param b      second param for calculation
     * @param length length of the series
     * @return list of calculated numbers
     */
    List<Integer> calculateSeries(int a, int b, int length) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < length + 1; i++) {
            int number = 1;
            for (int j = 0; j < i; j++) {
                number *= (int) Math.pow(2, j);
            }
            result.add(a + number * b);
        }
        return result;
    }

    /**
     * 4. task
     * Calculate a series of numbers where each number is calculated like
     * a+(2^i)*(2^i+1)...*b
     * Example
     * 1+(2^0)*2,1+(2^0)*(2^1)*2,1+(2^0)*(2^1)**(2^2)*2
     * THEN
     * return true if it has an even number
     *
     * @param a      first param for calculation
     * @param b      second param for calculation
     * @param length length of the series
     * @return list of calculated numbers
     */
    boolean seriesHasEvenNumber(int a, int b, int length) {
        return calculateSeries(a, b, length).stream().anyMatch(integer -> integer % 2 == 0);
    }
}

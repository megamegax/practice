import java.util.ArrayList;
import java.util.List;

public class ListManagement {
    /**
     * 1. task
     * Reverse the input list
     *
     * @param inputList list of strings
     * @return list of the reversed list of inputList
     */
    List<String> reverseList(final List<String> inputList) {

        List<String> lista = new ArrayList<>();

        for(int i = inputList.size()-1 ; i  >= 0 ; i--) {
            lista.add(inputList.get(i));

        }
        return lista;
    }


    /**
     * 2. task
     * Reverse the order of the list and filter the even numbers
     *
     * @param inputList list of input numbers
     * @return a list of the reversed list filtered to even numbers
     */
    List<Integer> reverseAndFilter(final List<Integer> inputList) {

        List<Integer> evenNumbers = new ArrayList<>();

        int num = 0;

        for(int i = inputList.size()-1 ; i >= 0 ; i--) {
            num = inputList.get(i);
                if(num % 2 == 0) {
                    evenNumbers.add(num);
                }
        }
        return evenNumbers;
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
    List<Integer> calculateSeries(final int a,final int b,final int length) {
        return null;
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
    boolean seriesHasEvenNumber(final int a,final int b,final int length) {
        return false;
    }
}

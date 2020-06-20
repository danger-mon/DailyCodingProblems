package dgd;

public class Problem2 {
    public static int[] solution(int[] numbers) {
        int[] newArray = new int[numbers.length];
        // Get total product
        int prod = 1;
        for (int i : numbers) {
            prod *= i;
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = prod/numbers[i];
        }
        return newArray;
    }
}
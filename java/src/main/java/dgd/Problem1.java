package dgd;

import java.util.HashSet;
import java.util.Set;

public final class Problem1 {
    public static boolean solution(int[] numbers, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : numbers) {
            if (set.contains(i)) {
                return true;
            }
            set.add(k-i);
        }
        return false;
    }
}

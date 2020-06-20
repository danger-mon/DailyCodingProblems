package dgd;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.json.simple.JSONArray;
import org.junit.jupiter.api.Test;

public class TestProblem2 {
    /**
     * Test Problem2
     */
    @Test
    void testApp() {
        try {
            Object[][] ar = TestUtils.getInputOutput("problem2");
            for (int i = 0; i < ar.length; i++) {
                Object[] o = ar[i];
                JSONArray inputArray = (JSONArray)((JSONArray)o[0]).get(0);
                JSONArray outputArray = (JSONArray)o[1];
                int[] input = new int[inputArray.size()];
                int[] output = new int[inputArray.size()];
                for (int j = 0; j<inputArray.size(); j++) {
                    input[j] = ((Long)inputArray.get(j)).intValue();
                    output[j] = ((Long)outputArray.get(j)).intValue();
                }
                assertArrayEquals(output, Problem2.solution(input), "Problem 2 solution failed test case: " + i);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            fail("Could not parse JSON file.");
        }
    }
}
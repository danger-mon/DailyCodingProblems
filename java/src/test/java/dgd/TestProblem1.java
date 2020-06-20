package dgd;

import org.json.simple.JSONArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestProblem1 {
    /**
     * Test Problem1
     */
    @Test
    void testApp() {
        try {
            Object[][] ar = TestUtils.getInputOutput("problem1");
            for (int i = 0; i < ar.length; i++) {
                Object[] testCase = ar[i];
                JSONArray input = (JSONArray)testCase[0];
                boolean output = (boolean)testCase[1];
                int[] num = null;
                int k = 0;
                for (int j = 0; j<input.size(); j++) {
                    if (j==0) {
                        JSONArray numbers = (JSONArray)input.get(j);
                        num = new int [numbers.size()]; 
                        for (int m = 0; m<numbers.size(); m++) {
                            num[m] = ((Long)numbers.get(m)).intValue();
                        }    
                    }
                    if (j==1) {
                        k = ((Long)input.get(j)).intValue();
                    }
                }
                assertEquals(output, Problem1.solution(num, k), "Problem 1 solution failed test case: " + i);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            fail("Could not parse JSON file.");
        }
    }
}

package dgd;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestUtils {
    /**
     * Method to convert the JSON file into useable intput and output data for the tests.
    * @return
    * @throws FileNotFoundException
    * @throws IOException
    * @throws ParseException
    */
    public static Object[][] getInputOutput(String problem) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();
        Reader reader = new FileReader("../testdata.json");
        JSONObject jsonObject = (JSONObject)parser.parse(reader);
        JSONArray testCases = (JSONArray)jsonObject.get(problem);
        Object[][] obj = new Object[testCases.size()][2];
        for (int i = 0; i<testCases.size(); i++) {
            JSONArray testCase = (JSONArray)testCases.get(i);
            obj[i][0] = (JSONArray)testCase.get(0);
            obj[i][1] = (Object)testCase.get(1);
        }
        return obj;
    }
}
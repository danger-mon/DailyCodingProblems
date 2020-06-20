package dgd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import dgd.Problem3.Node;

public class TestProblem3 {
    @Test
    public void testApp() {
        try {
            Problem3 p3 = new Problem3();
            Node node = p3.new Node("root", p3.new Node("left", p3.new Node("left.left", null, null), p3.new Node("right", null, null)), null);
            assertEquals("left.left", p3.deserialize(p3.serialize(node)).left.left.val, "Check serialization");
        } catch (Exception e) {
            System.out.println(e);
            fail("Could not decode JSON.");
        }
    }
    
}
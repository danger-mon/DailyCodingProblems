package dgd;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Problem3 {
    public class Node {
        public String val;
        public Node left;
        public Node right;
        public Node(String _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    public String serialize(Node root) {
        return serializeObject(root).toJSONString();
    }
    public JSONObject serializeObject(Node root) {
        JSONObject obj = new JSONObject();
        obj.put("val", root.val);
        if (root.left == null) {
            obj.put("left", null);
        } else {
            obj.put("left", serializeObject(root.left));
        }
        if (root.right == null) {
            obj.put("right", null);
        } else {
            obj.put("right", serializeObject(root.right));
        }
        return obj;
    }

    public Node deserialize(String text) throws ParseException {
        JSONParser parser = new JSONParser();
        return deserializeObject((JSONObject)parser.parse(text));
    }

    public Node deserializeObject(JSONObject obj) {
        if (obj == null) {
            return null;
        }
        Node node = new Node((String)obj.get("val"), deserializeObject((JSONObject)obj.get("left")), deserializeObject((JSONObject)obj.get("right")));
        return node;
    }
}
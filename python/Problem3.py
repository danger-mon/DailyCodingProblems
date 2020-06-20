import json

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def serialize(node):
    serialized = serializeNode(node)
    return json.dumps(serialized)

def serializeNode(node):
    serialized = {}
    serialized['val'] = node.val
    if node.left == None:
        serialized['left'] = None
    else:
        serialized['left'] = serializeNode(node.left)
    if node.right == None:
        serialized['right'] = None
    else:
        serialized['right'] = serializeNode(node.right)

    return serialized

def deserializeObject(obj):
    if obj == None:
        return None
    root = Node(obj['val'], deserializeObject(obj['left']), deserializeObject(obj['right']))
    return root

def deserialize(text):
    serialized = json.loads(text)
    print(serialized)
    return deserializeObject(serialized)
    
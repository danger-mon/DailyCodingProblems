import pytest
from .Problem1 import Solution1
from .Problem2 import Solution2
import json

with open("../testdata.json") as jsonFile:
    testCases = json.load(jsonFile)

@pytest.mark.parametrize("testInput, expected", testCases['problem1'])
def test_Problem1(testInput, expected):
    assert(Solution1(*testInput) == expected)

@pytest.mark.parametrize("testInput, expected", testCases['problem2'])
def test_Problem2(testInput, expected):
    assert(Solution2(*testInput) == expected)

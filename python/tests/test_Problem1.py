import pytest
from ..Problem1 import Solution

testCases1 = [
    ([[1,2,3], 5], True),
    ([[1,2,3], 6], False),
    ([[1], 1], False),
    ([[], 0], False),
    ([[0, 1], 1], True),
    ([[1, 1, 2], 2], True)
]

@pytest.mark.parametrize("testInput, expected", testCases1)
def test_Problem1(testInput, expected):
    assert(Solution(*testInput) == expected)

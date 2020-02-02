def Solution (numbers, k):
    setOfComplements = set()
    for n in numbers:
        if n in setOfComplements:
            return True
        setOfComplements.add(k-n)
    return False

print(Solution([1,2,3], 6))
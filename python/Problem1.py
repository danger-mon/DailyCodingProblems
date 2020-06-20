def Solution1 (numbers, k):
    setOfComplements = set()
    for n in numbers:
        if n in setOfComplements:
            return True
        setOfComplements.add(k-n)
    return False
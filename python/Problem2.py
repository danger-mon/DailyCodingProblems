def Solution2(numbers):
    product = 1
    for number in numbers:
        product *= number
    return [product/number for number in numbers]
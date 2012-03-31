fn fibonacci(calc)
    index = 1
    result = 0
    f1 = 1
    f2 = 0

    while index < calc
        index = index + 1
        result = f1 + f2
        f2 = f1
        f1 = result
    end

    result
end

print(fibonacci(8))
print(fibonacci(12))

# => 21
# => 144

# While loop

x = 0
y = 0

counter = 0

while y < 10
    while x < 10
        x = x + 1
        counter = counter + 1
    end
    x = 0
    y = y + 1
end

print(counter)

# => 100

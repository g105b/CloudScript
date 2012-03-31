# Simple inheritance example.
# All animals can make a noise, have a name, and have a certain number ofg legs
# but these properties are defined by each instance of an Animal.

class Animal
    fn makeNoise
        _noise
    end

    fn numLegs
        _legs
    end

    fn name
        _name
    end
end

class Cat < Animal
    fn construct(name)
        _name = name
        _noise = "meow"
        _legs = 4
    end
end

class Monkey < Animal
    fn construct(name)
        _name = name
        _noise = "ooh ooh ooh"
        _legs = 2
    end
end

cat = Cat.new("Molly")
monkey = Monkey.new("Clive")

print(cat.name, cat.makeNoise, cat.numLegs)
print(monkey.name, monkey.makeNoise, monkey.numLegs)

# => Molly
# => meow
# => 4
# => Clive
# => ooh ooh ooh
# => 2

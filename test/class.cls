# Class definition

print(self.class.name)
# => Object

# Same syntax as Ruby, "< Object" is implicit is no superclass is specified.
class Language < Object
  fn initialize(name)
    # Instance variable start with an underscore
    _name = name
  end
  
  fn name
    _name
  end
end

# Calling "new" allocated a new object of that class and calls "initialize"
# passing all the arguments.
lang = Language.new("CloudScript")

print(lang.name)
# => CloudScript
print(lang.class.name)
# => Language
print(Language.superclass.name)
# => Object

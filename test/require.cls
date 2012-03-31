if !LOADED
  print("File loaded!")
  LOADED = true
  require("test/require.cls")
else
  print("File required!")
end

# => File loaded!
# => File required!

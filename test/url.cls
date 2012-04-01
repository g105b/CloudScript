dt = http://cloudscript.g105b.com/DateTime.php

hour = dt.hour
minutes = dt.minutes
minutesRelative = " past "

if(minutes > 30)
  minutes = minutes - 30
  hour = hour + 1
  minutesRelative = " to "
end

if(hour > 12)
  hour = hour - 12
end

#print(dt.minutes)
print("It's " + minutes + " minutes" + minutesRelative + hour)

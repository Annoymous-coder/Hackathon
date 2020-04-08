import re

file = open('test.txt',"r")
resList = []
for line in file:
	line = line.rstrip()
	x = re.findall("^[A-Z].*[/^].*[0-9]$",line)
	if x:
		print(x)


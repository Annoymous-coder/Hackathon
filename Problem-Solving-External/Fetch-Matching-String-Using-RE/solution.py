import re

file = open('test.txt')

#line = file.read()
#print(line)

resList = []
for line in file:
	print "Checking in the string:",line
	x = re.findall("^[A-Z].*[/^].*[0-9]$",line)

	if(x):
		print("This string gets matched to the conditions\n")
		resList.append(x)
	else:
		print("This string does not gets matched to the conditions")	
print "\nThe extracted strings are"			
print(resList)
file.close()
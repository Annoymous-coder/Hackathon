#create an empty string, Traverse through the given string and check if the current char is present in output, if not add it and give respective flag value.
def repfree(s):
	flag = False #assume that there is rep. in string or can vice-versa
	output = ""
	for ch in s:
		if ch not in output:
			flag = True
			output = output + ch
		else:
			flag = False
	#print(output) This would print all characters repfree.
	print(flag)
	

#s = "s(("
#repfree(s) 

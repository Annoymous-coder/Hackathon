n = int(input("enter n"))
while n > 0:
	flag = 0
	str = input("str")
	for i in range(len(str)):
		count = str.count(str[i])
		# since ascii of a is 97 in real terms, but here its 1
		# in-order to equalize add 96 to the frequency of character.
		if count + 96 != ord(str[i]):
			flag = 1
			break
	if flag == 1:
		print("no")
	else:
		print("yes")
	n = n - 1
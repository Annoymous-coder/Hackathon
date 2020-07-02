def evenOddString(s):
	print("Characters at even places")
	for i in range(0, len(s)):
		if i%2 == 1:
			print(s[i])
	print("Characters at odd places")
	for i in range(0, len(s)):
		if i%2 == 0:
			print(s[i])

s = "hello"
evenOddString(s)
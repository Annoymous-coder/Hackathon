def swapArray(a, b):
	for i in range(0,len(a)):
		if a[i] == b[i]:
			a[i],b[i] = 0,0
		else:
			temp = a[i]
			a[i] = b[i]
			b[i] = temp
	print("Modified list a")
	for i in a:
		print(i, end = "\t")
	print("\n")
	print("Modified list b")
	for j in b:
		print(j, end = "\t")

a = [1,2,3]
b = [1,3,2] 

swapArray(a,b)
 def asc():
	l=[0,1,2]
	flag = 0
	i=1
	while i < len(l):
		if l[i] < l[i-1]:
			flag = 1
		i+=1
	if flag==0 and len(l)>0:
		print("ascending order")
	else:
		print("not asc")
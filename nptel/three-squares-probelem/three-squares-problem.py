#Three square problem. The main logic used here is to create a list of nos which does not satisfy the legendre's three square formula i.e if no is equal to 4^a(8b+7) where a,b are arbitrary nos then that no does not have a three square soln.
import math  
def threesquares(n):
	flag = False
	list1 = []
	if n < 0:
		flag = False
	else:
		for i in range(0,100):
			for j in range(0,100):
				tempVar = (8^i)*(4*j + 7)
				list1.append(tempVar) #add the tempVar to the list which does satisfies the above problem.
		if n not in list1: 
			flag = True
		else:
			flag = False
	print(flag)



		

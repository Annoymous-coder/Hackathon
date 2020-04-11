num = 3    #The number for which the factorial is to be found

def getFactorial(num):
	if num == 0:
		return 1
	elif num == 1:
		return 1
	else:
		return num * getFactorial(num-1)

print("The factorial of {} is {}".format(num,getFactorial(num)))
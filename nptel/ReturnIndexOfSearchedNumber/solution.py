nums = [1,2,7,4,6,5]		#List of numbers
targetNumber = 5			#Number to be searched

def searchNum(nums,targetNumber):	#Method to return the index of found number else returns -1
	index = -1
	for i in range(0,len(nums)):
		if nums[i] == targetNumber:
			index = i
	return index

if searchNum(nums, targetNumber) == -1:		#Check if the number is not -1
	print("The number is not found")
else:
	print("The number is found in the index ",searchNum(nums,targetNumber))
n = int(input())

# n+1 : inclusive
for i in range(1,n+1):
	# check of multiple of both 5 and 3 first since if it is checked at else
	# it might not execute due to the presence of 3 or 5 multiples. So give high priority.
	if i % 15 == 0:
		print("FizzBuzz")
		# continue is needed since we need to skip the number after printing its print statement
	elif i % 3 == 0:
		print("Fizz")
		continue
	elif i % 5 == 0:
		print("Buzz")
		continue
	# if continue is used then no need to use else
       #else
	print(i) #Print the number if its not a multiple of 3,5,or 3&5



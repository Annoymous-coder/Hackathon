def getIndex(a,n,target):
	start = 0 
	end = len(a)-1

	while start <= end:
		if a[start] + a[end] > target:
			end = end - 1
		elif a[start] + a[end] < target:
			start = start + 1
		if a[start] + a[end] == target:
			print "start=",start 
			print "end=",end 
			#return
		start = start + 1 
		end = end - 1

n = 5
a = [1, 2, 3, 4, 5]	
target = 8
getIndex(a,n,target)
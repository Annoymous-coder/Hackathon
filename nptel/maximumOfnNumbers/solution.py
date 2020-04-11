#Write a Python program to find average of maximum of ‘n’ positive numbers entered by user.
#But, if the input is negative, display the average
#(excluding the average of negative input) and end the program
def checkSum():
    list1 = []
    sum1 = 0
    avg = 0
    counter = 0
    n = int(input("enter no of elements"))
    print("Enter {} elements with an enter after every element".format(n))
    for i in range(0,n):
        ele = int(input())
        list1.append(ele)
    for i in list1:
        if i < 0:
            break
        else :
            counter+=1
            sum1+=i
            avg=sum1/counter
    print("avg is",avg)
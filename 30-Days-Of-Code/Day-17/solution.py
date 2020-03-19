#Write your code here
class Calculator:
    def power(self,n,p):
        if n<0 or p<0:
            raise Exception("n and p should be non-negative")	#java equivalent of throw new Excecption keyword in python it's just raise Exception("message") 
        else:
            return(n**p)

myCalculator=Calculator()		#java equivalent of Calculator obj = new Calculator();
T=int(input())
for i in range(T):
    n,p = map(int, input().split())
    try:
        ans=myCalculator.power(n,p)
        print(ans)
    except Exception as e:	#Java equivalent is catch(Exception e) { sysout(e.getMessage(); }
        print(e)   
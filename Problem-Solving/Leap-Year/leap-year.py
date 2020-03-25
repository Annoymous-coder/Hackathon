leap = False
def is_leap(year):
    if year%400==0 or year%4==0 and year%100!=0:
         leap = True
    else:
         leap = False
    print(leap)    


year = int(input("Enter year"))
object1 = is_leap(year)


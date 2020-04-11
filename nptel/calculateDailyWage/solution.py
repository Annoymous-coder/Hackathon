#Write a Python script that computes the employee's weekly pay,
#given an input the number of hours an employee worked and the hourly wage.
#Count any hours over 40 as overtime and the salary is half of the hourly wage.
noOfHours = int(input("Enter no of hours"))

hourlyWage = float(input("Enter the hourly wage"))

def countPay(noOfHours, hourlyWage):
    overtimePay = 0
    overtimeHours = noOfHours - 40
    NormalPay = 0
    if(noOfHours > 40):
        NormalPay = 40 * hourlyWage
        overtimePay = overtimeHours * hourlyWage * 1.5
        return(NormalPay + overtimePay)
    else :
        return(noOfHours * hourlyWage)

countPay(noOfHours, hourlyWage)
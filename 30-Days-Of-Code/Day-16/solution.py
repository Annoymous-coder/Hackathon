#!/bin/python3

import sys


S = input().strip()
try:
    a = int(S)
    print(a)
except :
    print("Bad String")    
    

#The main objective of this program is to take all the strings which can be parsed(change of data-type) to intger from String 
#if it is of the form of "1234" or any string with only numbers but if there are any strings like "abc" format , it'll raise an
#error which needs to be catched. We do the parsing from string token to integer using int(String Token) and catch the
#exceptions using try: and except NameError: .    

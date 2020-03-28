#!/bin/python3

import math
import os
import random
import re
import sys
#title() is inbuilt func but it fails in few cases since words like they're is not continous alphabets so it is considered as not a word entirely.
# Complete the solve function below.
def solve(s):
    a = s.split(' ')  #split the string into a list whenever space is encountered
    for i in range(len(a)):   #traverse through the string
        a[i] = a[i].capitalize()     #capitalize() method uppercases every first letter
        s = ' '.join(a)		#then make this list into a string by joining them with spaces
    return s    	
if __name__ == '__main__':
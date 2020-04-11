#ask for input string and append with "welcome",
#if empty raise a user-defined null string exception
class Error(Exception):
	pass
class NullStringException(Error):	#user-defined exception
	pass      #raised when the input string is empty
	
try:
	name = raw_input("enter name")
	if len(name) == 0:		#check string is empty or not
		raise NullStringException	#if yes raise exception
	print("Welcome ",name)	
except NullStringException:		#exception defn
	print("The input string is empty/null")
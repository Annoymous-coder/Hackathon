def swap_case(s):
    a = ""
    for let in s:
	if a.isupper():
		a+=let.lower()
	else:
		a+=let.upper()
    return a	

if __name__ == '__main__':
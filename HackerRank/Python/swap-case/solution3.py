def swap_case(s):
   return "".join([let.upper() if let.isupper(): else let.lower() for let in s])

if __name__ == '__main__':
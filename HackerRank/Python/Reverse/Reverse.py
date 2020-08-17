#/usr/bin/python3.7
def Reverse(sentence):
    print("The Given String is : {}".format(sentence))
    # split string into list
    sentence = sentence.split(" ")
    rev = [""]*len(sentence)
    rev = sentence[::-1]
    # reversed list to reversed string
    rstr = ""
    for word in rev:
        rstr+=word
        rstr+=" "

    # swap cases
    finalStr=""
    for i in range(0,len(rstr)):
        if rstr[i].isupper():
            finalStr+=rstr[i].lower()
        elif rstr[i].islower():
            finalStr+=rstr[i].upper()
        else:
            finalStr+=" "
    print("The Resulting String is : {}".format(finalStr))

def main():
    Reverse("coDing IS AweSome")

if __name__ == "__main__":
    main()
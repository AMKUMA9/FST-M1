from ast import Mod


numtuple=tuple(input("enter the no in the tuple").split(","))
#num=0
for number in numtuple :
    #num=int(number) % 5
    if int(number)%5==0:
        print(number)


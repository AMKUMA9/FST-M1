List1= list(input("Enter the numbers in the list:").split(","))
#get the first num
X=List1[0]
Y=List1[-1]
#Check if its same
if X==Y:
    print("True")
else:
    print("False")

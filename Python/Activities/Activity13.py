def calculatesum(numbers):
    sum=0
    for number in numbers:
        sum+=int(number)
        return sum
numlist= list(input("Enter no in the list").split(",")) 
result=calculatesum(numlist)
print("Sum of list is "+ str(result))       
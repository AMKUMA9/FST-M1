list1=[1,2,3,4,5]
list2=[6,7,8,9,10]
X=0 
Y=0
list3=[]
for number in list1:
    X= int(number%2)
    if X>0:
        list3.append(number)
    
for number in list2:
    Y= int(number%2)
    if Y==0:
        list3.append(number)
        
print(list3)

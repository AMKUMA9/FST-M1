def sum(n) :
    if n>0:
        return n+sum(n-1)
    else:
        return n

result= sum(10)
print(result)



Fruit_shop={"apple":5,"banana":2,"litchi":10,"mango":50}
check=input("Fruit in stock:").lower()
if(check in Fruit_shop):
    print("In stock")
else:
    print("Out of stock")    

user1=input("Enter your Name")
user2=input("Enter your Name")
user1Answer=input(user1 + ",What do you want to choose rock, paper, scissors?").lower()
user2Answer=input(user2 + ", What do you want to choose rock, paper, scissors?").lower() 
if user1Answer == user2Answer :
    print("Its a Tie")
elif user1Answer == "rock":
     if user2Answer == "paper":
        print("Winner is Paper") 
     else :   
         print("Winner is rock")     
elif user1Answer == "paper" :
    if user2Answer == "scissors":
        print("Winner is Scissors")
    else :   
         print("Winner is paper")  
elif user1Answer == "Rock" :
    if user2Answer == "Scissors":
        print("Winner is scissors") 
    else :   
         print("Winner is Rock")        
elif user1Answer == "paper" :
    if user2Answer == "rock":
        print("Winner is rock") 
    else :   
         print("Winner is paper")          
elif user1Answer == "scissors" :
    if user2Answer == "paper":
        print("Winner is scissors")
    else:
        print("Winner is paper")    
elif user1Answer == "scissors":
    if user2Answer == "rock":
        print("Winner is rock") 
    else :   
         print("Winner is scissors")        
else :
    print("User input invalid,Try Again")    
# Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit


player1 = input("Enter the name of the player1:")
player2 = input("Enter the name of the player2:")

player1_answer = input(player1 + ", do you want to choose rock, paper or scissors?").lower()
player2_answer = input(player2 + ", do you want to choose rock, paper or scissors?").lower()

if player1_answer == player2_answer:
    print("Its Tie")
elif player1_answer == 'rock':
    if player2_answer == 'scissors':
        print("rock wins")
    else:
        print("Paper wins") 
elif  player1_answer == 'paper':
    if player2_answer == 'rock':
        print("paper wins")
    else:
        print("scissors wins") 
elif  player1_answer == 'scissors':
    if player2_answer == 'paper':
        print("scissors wins")
    else:
        print("rock wins")     
 	
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")







           

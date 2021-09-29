# Assignment : Calculate the last 3 transaction(mini statement) done on a debit card w.r.to the amount available, 
#               note he cannot withdraw more than the balance & available currency notes
#               e.g. if an atm has 100 * 2 , 200 * 3, 500 * 10 = 200 + 600 + 5000 = 5800 
#                   the total withdrawal amount cannot be more than than 90 % of the ATM cash e.g. as per above 90% of 5800 
#                   (i.e. 5220 round off 5200 since we dont have 20 rs notes)
# Assumptions : 
#                   1. Currency in the ATM is fixed 
#                   2. Balance for the Debit Card is predeclared
#                   3. No of transactions to be shown is fixed to last 3


atm_money = {1000: 5, 500: 10, 200: 10}
total_amt = 0
for k, v in atm_money.items():
    total_amt += k * v

transactions = list()

balance = int(input("Enter the balance : "))


def withdraw():
    global total_amt
    global balance
    global transactions
    amt = int(input("Enter the withdraw amount : "))
    permitted_amt = 0.9 * total_amt
    if amt > permitted_amt:
        return "Sorry, transaction not permitted. Maximum amount permitted is {} ".format(permitted_amt)
    else:
        temp_amt = amt
        denominations = list(atm_money.keys())
        i = 0
        while temp_amt > 0:
            if i == len(denominations) :
                return "Unavailable notes"
            notes = temp_amt // denominations[i]
            if notes > atm_money[denominations[i]]:
                return "Transaction can not be done."
            temp_amt = temp_amt % denominations[i]
            atm_money[denominations[i]] -= notes
            i += 1
            
                
        total_amt -= amt
    balance -= amt

    transaction = "Withdrawn Rs. {} ".format(amt)
    transactions.append(transaction)
    return transaction


def view_transaction_history():
    global transactions
    if len(transactions) == 0 :
        print("No transactions made ")
    elif len(transactions) < 3 : 
        print("\nYour previous transactions : ")
        i = len(transactions) - 1
        while i > -1 :
            print(transactions[i])
            i -=1
    else : 
        i = len(transactions) - 1
        print("\nYour Last 3 Transactions in reverse chronological order : ")
        while i >= len(transactions) - 3 :
            print(transactions[i])
            i -=1


def exit():
    print("Exiting")


choice = 1
while choice < 3:
    choice = int(
        input("1. Withdraw Money\t2. View Transaction History\t3. Exit : \t"))
    if choice == 1:
        transaction_msg = withdraw()
        print(transaction_msg)
    elif choice == 2:
        view_transaction_history()
    else:
        exit()
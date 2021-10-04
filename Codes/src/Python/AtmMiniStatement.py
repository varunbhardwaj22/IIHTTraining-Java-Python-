#Mini Statement


daily_limit=5000
txn_limit=0
currency={100:2,200:3,500:10}
total_cash_in_atm=0
for k in currency:
    total_cash_in_atm+=k*currency[k] 

bank_bal=int(input("Enter the initial bank balance:"))

for i in range(11):
    user_choice=str(input("Withdraw or deposit? Choose W or D:"))
    if(user_choice=='W' or user_choice=='w'):  
        try:
            amt=int(input("Enter the amount:"))
        except ValueError:
            print("Amount can be integer only")
        else:
            if(amt>bank_bal):
                print('Insufficient bank balance')
            else:
                if(txn_limit>=daily_limit):
                    print("Daily limit reached. Cannot withdraw the money")
                else:
                    if(amt>=.9*total_cash_in_atm):
                        print("Sorry! ATM Out of cash")
                    else:
                        txn_limit+=amt
                        bank_bal-=amt
                        print("Money withdrawl successful")
                
        finally:
            print("Balance is :",bank_bal)

    elif(user_choice=='D' or user_choice=='d'):
        if(txn_limit>=daily_limit):
            print("Daily limit reached. Cannot deposit the money")
        else:
            amt=int(input("Enter the amount:"))
            bank_bal+=amt
            print("Balance is :",bank_bal)

    else:
        print("Invalid input")
        break
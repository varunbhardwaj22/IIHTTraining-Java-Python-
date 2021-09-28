# Assignment 3: Write a Program to find the numbers absent from a sequence of numbers e.g. [0,1,2,5] , 
#               step should be dynamic,missing number should be located based on the step
# Expected Output : 3,4 are missing

num_seq = list(map(int, input("Enter the sequence : ").split()))
step = int(input("Enter the step size : "))

missing = list()
missing_val = None 

i = 1
prev = num_seq[0]
while i < len(num_seq) :
    missing_val = prev + step
    while missing_val < num_seq[i] :
        missing.append(missing_val)
        missing_val += step 
    prev = num_seq[i]
    i += 1

print("Missing Values : ", end = " ")
print(missing)
# Assignment 2: Give me a tower of hanoi 

# Expected OUTPUT PART 1:
#                   1
#               3       3
#           5       5      5 
#       

# Expected OUTPUT PART 2:

# Row 1 : 1s = 1
# Row 2 : 3s = 3 * 2 = 6
# Row 5 : 5s = 5 * 3 = 15


lines = int(input("Enter the number of lines : "))
step = int(input("Enter the step size : "))
value = 1

for i in range(lines) :
    print("  " * (lines - i - 1), end = "")
    for _ in range(i + 1) :
        print(value, end = "   ")
    print()
    value += step
value = 1
print("\n")
for line_num in range(1, lines + 1) :
    print(f"Line {(line_num + 1)} : {value}s : {value} * {line_num} ")
    value += step 